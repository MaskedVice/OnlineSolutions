
public class CN_DecryptString {
    public static char kThCharaterOfDecryptedString(String s, Long k) 
    {
        
        // Write your code here
        String curString = "";
        long curTimes = 0;
        char ans = 0;
        int i = 0;
        while(i < s.length()){
            
            while(i < s.length() &&Character.isAlphabetic(s.charAt(i))){
                curString = curString+String.valueOf(s.charAt(i++));
            }
            long t = 1;
            while(i < s.length() && Character.isDigit(s.charAt(i))){
                curTimes = t*curTimes + Character.getNumericValue(s.charAt(i));
                t*=10;
                i++;
            }
            if(k-(curString.length()*curTimes)>0){
                k-=curTimes;
                curString = "";
                curTimes = 0;
            } else{
                k = k*curString.length() % curString.length();
                ans = curString.charAt((int)(k+1));
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        String s = "a2b3cd3";
        Long k = 8L;
        System.out.println(kThCharaterOfDecryptedString(s, k));
    }
}
