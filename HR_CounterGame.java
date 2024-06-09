public class HR_CounterGame {
    public static String counterGame(long n) {
    
        int counter = 0;
        
        while(n != 1) {
            long tmpNum = 1;
            while(tmpNum <= n) {
                tmpNum *=2;
            }
            tmpNum = tmpNum / 2;
            if(tmpNum == n) {
                n /= 2;
            } else {
                 n -= tmpNum;
            }
            counter++;
        }
        
        return counter % 2 == 0 ? "Richard" : "Louise";
    
        }

    public static void main(String[] args) {
        System.out.println(new HR_CounterGame().counterGame(1768820483));
    }
}
