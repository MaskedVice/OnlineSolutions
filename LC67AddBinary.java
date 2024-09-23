public class LC67AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0, sum = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            sum = carry;
            if(i>=0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum%2);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }



    public static void main(String[] args) {    
        LC67AddBinary obj = new LC67AddBinary();
        String a = "11", b = "1";
        String ans = obj.addBinary(a,b);
        System.out.println(ans);
    }
}
