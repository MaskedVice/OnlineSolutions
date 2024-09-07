public class LC7ReverseInteger {
    public int reverse(int x) {
        int y = Math.abs(x);
        int ans = 0;
        while(y!= 0){
            int temp = y % 10;
            y = y / 10;
            ans = ans * 10 + temp;
        }   
        if(x < 0){
            ans = -ans;
        }
        if(ans >= Integer.MAX_VALUE || ans <= Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }


    public static void main(String[] args) {
        LC7ReverseInteger obj = new LC7ReverseInteger();
        System.out.println(obj.reverse(1200));
    }
}
