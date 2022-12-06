import java.util.HashSet;
import java.util.*;

public class LC2443 {
    public boolean sumOfNumberAndReverse(int num) 
    {
        int rev = 0;
        StringBuilder s = new StringBuilder();
        for(int i = 1 ; i < num ; i++)
        {
            rev = Integer.parseInt(s.append(i).reverse().toString());
            if(i+rev == num)
            {
                return true;
            }
            s = new StringBuilder();
        }
        return false;
    }

    public static void main(String[] args) {
        LC2443 a = new LC2443();
        a.sumOfNumberAndReverse(443);
    }
}
