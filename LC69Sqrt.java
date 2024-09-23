/**
 * LC69Sqrt
 */
public class LC69Sqrt {
    public int mySqrt(int x) {
        if(x<=1) return x;
        double start = 0;
        double end = x;
        double mid = 0,sqr = 0;
        
        while(end>start){
            mid = (start + end)/2;
            sqr = x/mid;
            if( (int) sqr == (int) mid){
                return (int) (sqr > mid ? sqr : mid);
            }
            else if(sqr > mid){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return (int) mid;
    }
    

    public static void main(String[] args) {
        LC69Sqrt obj = new LC69Sqrt();
        System.out.println(obj.mySqrt(36));
    }
}
