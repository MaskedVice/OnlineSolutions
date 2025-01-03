import java.util.HashMap;
import java.util.Map;

public class LC_1371 {
    public int findTheLongestSubstring(String s) {
        Map<String,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String cur = "00000";
        map.put(cur,-1);
        int[] state = new int[]{0,0,0,0,0};

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a')
                state[0] = (state[0] + 1) % 2;
            else if(s.charAt(i) == 'e')
                state[1] = (state[1] + 1) % 2;
            else if(s.charAt(i) == 'i')
                state[2] = (state[2] + 1) % 2;
            else if(s.charAt(i) == 'o')
                state[3] = (state[3] + 1) % 2;
            else if(s.charAt(i) == 'u')
                state[4] = (state[4] + 1) % 2;
            cur = "" + state[0] + state[1] + state[2] + state[3] + state[4];
            if(map.containsKey(cur)){
                if(map.get(cur) == -1){
                    max = i;
                }
                max = Math.max(max,Math.abs(i-map.get(cur)));
            } else {
                map.put(cur,i);
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        System.out.println(new LC_1371().findTheLongestSubstring(s));
    }
}
