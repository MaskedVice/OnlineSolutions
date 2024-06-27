public class LC70ClimbingStairs {

    public int climbStairs(int n) {
        if(n<=2) return n;
        if(n-2>0) return climbStairs(n-2) + climbStairs(n-1);
        return climbStairs(n-1);
    }

    public static void main(String[] args) {
        LC70ClimbingStairs obj = new LC70ClimbingStairs();
        System.out.println(obj.climbStairs(3));
    }
}
