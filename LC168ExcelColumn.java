public class LC168ExcelColumn {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        int cN = columnNumber;
        int rem = 0;
        while(cN > 0){
            rem = (cN-1)%26;
            ans = (char)(rem+'A') + ans;
            cN = (cN-1)/26;
        }
        return ans;
    }

    public static void main(String[] args) {
        LC168ExcelColumn a = new LC168ExcelColumn();
        System.out.println(a.convertToTitle(28));
    }
}
