import java.util.HashMap;
import java.util.Map;

public class LC1371 {
    public int findTheLongestSubstring(String s) {
        int max = 0;

        Map<String,Integer> prevSeen = new HashMap<>();
        int[] bitMask = new int[]{0,0,0,0,0};
        String cur = getString(bitMask);
        prevSeen.put(cur,0);
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a'){
                bitMask[0] = (bitMask[0] + 1) % 2;
                cur = getString(bitMask);
            } else if(s.charAt(i) == 'e'){
                bitMask[1] = (bitMask[1] + 1) % 2;
                cur = getString(bitMask);
            } else if(s.charAt(i) == 'i'){
                bitMask[2] = (bitMask[2] + 1) % 2;
                cur = getString(bitMask);
            } else if(s.charAt(i) == 'o'){
                bitMask[3] = (bitMask[3] + 1) % 2;
                cur = getString(bitMask);
            } else if(s.charAt(i) == 'u'){
                bitMask[4] = (bitMask[4] + 1) % 2;
                cur = getString(bitMask);
            }
            if(prevSeen.containsKey(cur)){
                max = Math.max(max,i - prevSeen.get(cur));
            }else{
                prevSeen.put(cur,i);
            }

        }
        return max;
    }

    private String getString(int[] b){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < b.length ; i++){
            sb.append(b[i]);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(new LC1371().findTheLongestSubstring("eleetminicoworoep"));
    }
}
