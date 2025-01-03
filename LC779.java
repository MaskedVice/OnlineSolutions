public class LC779 {
    public int kthGrammar(int n, int k) {
        String s = doWork(n);
        return Integer.valueOf(s.charAt(k-1) + "");
    }

    String doWork(int n){
        if(n == 1){
            return "0";
        }
        String cur = doWork(n-1);
        StringBuilder sb = new StringBuilder();
        for(char c : cur.toCharArray()){
            if(c == '0'){
                sb.append("01");
            } else {
                sb.append("10");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        LC779 lc779 = new LC779();
        int n = 5;
        int k = 8;
        System.out.println(lc779.kthGrammar(n, k));
    }
}
