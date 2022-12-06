import java.util.ArrayList;

public class LC9 {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        ArrayList<Integer> s = new ArrayList<>();
        while(x>0)
        {
            s.add(x%10);
            x/=10;
        }
        int l = 0 , r = s.size()-1;
        while(l<r )
        {
            if(s.get(l) != s.get(r)) return false;

            l++;r--;
        }
        return true;
    }

    public static void main(String[] args) {
        LC9 a = new LC9();
        a.isPalindrome(567898765);
    }
}
