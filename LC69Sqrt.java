public class LC69Sqrt {
    public int mySqrt(int x) {
        float l = 1,r = x;
        while(l<=r){
            float mid = (r + l)/2;
            float sqr = mid * mid;
            if(sqr == x ){
                return (int)mid;
            }
            else if(sqr < x){
                l = mid;
            }
            else{
                r = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LC69Sqrt obj = new LC69Sqrt();
        int x = 64;
        int ans = obj.mySqrt(x);
        System.out.println(ans);
    }
}
