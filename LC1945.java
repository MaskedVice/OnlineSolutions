public class LC1945 {
    public int getLucky(String s, int k) {
        long ans = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
                sb.append(c - 'a' + 1);
        }
        
        while(k > 0){
            ans = 0;
            for(int i = 0 ; i < sb.length() ; i++){
                ans += sb.charAt(i) - '0';
            }
            sb = new StringBuilder(String.valueOf(ans));
            k--;
        }
        
        return (int)ans;
    }

    public static void main(String[] args) {
        
        LC1945 a = new LC1945();
        String s = "leetcode";
        int k = 2;
        System.out.println(a.getLucky(s,k));
    }
}
