import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HCtest {
    public static int getAnagram(String s) {
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring((s.length()/2));
        int ans = 0;
        int[] s1c = new int[10];
        for (int i = 0 ; i < s1.length() ; i ++) {
            s1c[Character.getNumericValue(s1.charAt(i))]++;
            s1c[Character.getNumericValue(s2.charAt(i))]--;
        }
        for(int i = 0 ; i < s1c.length ; i++)
        {
            if(s1c[i]>0)
                ans+=s1c[i];
        }
        return ans;
    }

        public static void main(String[] args) {
            System.out.println(getAnagram("123122"));
        }
}
