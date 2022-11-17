public class LC5 {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        int l = 0,r = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = expandAroundCenter(s, i, i);
            int l2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(l1, l2);
            if (len > r - l) {
                l = i - (len - 1) / 2;
                r = i + len / 2;
            }
        }
        return s.substring(l,r+1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    public static void main(String[] args) {
        LC5 a = new LC5();
       System.out.println(a.longestPalindrome("ccc"));
    }
}
