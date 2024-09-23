public class LC28FindTheIndexOfFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        int i = haystack.length(),j = needle.length();
        if(i == 0 || j == 0 || j>i) return -1;

        for(int k = 0 ; k < i ; k++){
            if(haystack.charAt(k) == needle.charAt(0)){
                if(k+j > i) break;
                for(int l = 0 ; l < j ; l++){
                    if(haystack.charAt(k+l) != needle.charAt(l)) break;
                    if(l == j-1) return k;
                }
            }
        }    
        return -1;
    }


    public static void main(String[] args) {
        LC28FindTheIndexOfFirstOccurenceInAString obj = new LC28FindTheIndexOfFirstOccurenceInAString();
        String haystack = "leetcode";
        String needle = "code";
        System.out.println(obj.strStr(haystack,needle));
    }
}
