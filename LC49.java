import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC49 {

    //TRY USING MAP NEXT TIME WITH  SORTED STRING AS KEY
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> cList = new ArrayList<>();
            String cur = strs[i];
            if(cur == "") continue;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j] != "" && isAnagram(cur, strs[j])) {
                    cList.add(strs[j]);
                    strs[j] = "";
                }
            }
            res.add(cList);

        }
        return res;
    }

    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s1.length != t1.length)
            return false;
        Arrays.sort(s1);Arrays.sort(t1);
        for(int i = 0 ; i < s1.length ; i++)
        {
            if(s1[i] != t1[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
       String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
       LC49 lc49 = new LC49();
       lc49.groupAnagrams(strs).forEach(x -> System.out.println(x));; 
    }
}
