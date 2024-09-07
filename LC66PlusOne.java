public class LC66PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length,carry = 0;
        digits[n-1] = digits[n-1]+1;
        if(digits[n-1] >=10){
            digits[n-1]-=10;
            carry = 1;
        }

        for(int i = digits.length-2; i >= 0 ; i--){
            digits[i]+=carry;
            if(digits[i]>=10){
                digits[i]-=10;
                carry = 1;
            }
            else{
                carry = 0;
            }
        }
        if(carry == 1){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            for(int i = 0 ; i < digits.length ; i++){
                ans[i+1] = digits[i];
            }
            return ans;
        }
        return digits;
    }


    public static void main(String[] args) {
        LC66PlusOne obj = new LC66PlusOne();
        int[] digits = {1,9,3};
        int[] ans = obj.plusOne(digits);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}
