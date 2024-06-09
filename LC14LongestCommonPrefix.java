import java.util.Arrays;

public class LC14LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0; i<first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1 && strs[0].length() > 0){
            return strs[0];
        }
        String base = "";
        String cur = strs[0];
        if(cur == "" || cur.length() == 0){
            return "";
        }
        boolean valid = true;
        int j = 0;
        while(valid){
            for(int i = 1 ; i < strs.length ; i++){
                String thisString = strs[i];
                if(thisString.length() <= j || cur.length() <=j || thisString.charAt(j) != cur.charAt(j) ){
                    valid = false;
                }
            }
            if(valid){
                base +=cur.charAt(j);
                j++;
            }
        }
        return base;
    }

    public static void main(String[] args) {
        LC14LongestCommonPrefix obj = new LC14LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
