public class LC551 {
    public boolean checkRecord(String s) {
        boolean ifAbsentMoreThan2Days = s.chars().filter(x -> x == 'A').count()>=2;
        boolean ifLateFor3OrMoreConsecutiveDays = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L')
            {
                int j = i,curcount = 0;
                while(j<s.length() && s.charAt(j) == 'L')
                {
                    j++;
                    curcount++;
                }
                i+=curcount;
                count = Math.max(count,curcount);
            }
        }
        ifLateFor3OrMoreConsecutiveDays = count>=3;
        return !(ifAbsentMoreThan2Days || ifLateFor3OrMoreConsecutiveDays);
    }
    public static void main(String[] args) {
        LC551 a = new LC551();
        System.out.println(a.checkRecord("PPALLP"));
    }
}
