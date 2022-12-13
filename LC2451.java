import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class LC2451 {
    public String oddString(String[] words) {
        HashMap<List<Integer>,int[]> freq = new HashMap<>();
        for (int k = 0 ; k < words.length ; k++ ){
            List<Integer> diff = new ArrayList<>();
            for (int i = 1; i <= words[k].length()-1; i++) {
                diff.add(words[k].charAt(i)-words[k].charAt(i-1));
            }
            if(freq.containsKey(diff))
            {
                int[] cur = freq.get(diff);
                cur[0]++;
                freq.put(diff, cur);
            }
            else{
                int[] cur = new int[]{1,k};
                freq.put(diff, cur);
            }
        }
        int index = -1;
        for (int[] e : freq.values()) {
            if(e[0] == 1)
            {
               index = e[1];
               break;
            }
        }
        return words[index];
    }
    public static void main(String[] args) {
        LC2451 a = new LC2451();
        a.oddString(new String[]{"aaa","bob","ccc","ddd"});
    }
}
