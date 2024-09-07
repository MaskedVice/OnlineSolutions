import java.util.ArrayList;

public class LC9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        String xx = String.valueOf(x);
        int l = 0 , r = xx.length()-1;

        while(l<r){
            if(xx.charAt(l) != xx.charAt(r))
                return false;
            l++;r--;
        }
        return true;
    }

    public static void main(String[] args) {
        LC9 a = new LC9();
        a.isPalindrome(10);
    }
}
