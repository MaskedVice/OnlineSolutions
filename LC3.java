import java.util.HashSet;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> dupSet = new HashSet<>();
        int l = 0 , r = 0 , ans = 0;
        for(r=0;r<s.length();r++)
        {
            if(!dupSet.contains(s.charAt(r)))
            {
                dupSet.add(s.charAt(r));
            }
            else
            {
                ans = Math.max(ans, dupSet.size());
                while(dupSet.contains(s.charAt(r)))
                {
                    dupSet.remove(s.charAt(l++));
                }
                dupSet.add(s.charAt(r));
            }
        }
        return Math.max(ans, dupSet.size());
    }

    public static void main(String[] args) {
        LC3 a = new LC3();
        System.out.println(a.lengthOfLongestSubstring("qrsvbspk"));
    }
}
