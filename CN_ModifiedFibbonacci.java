public class CN_ModifiedFibbonacci {

    public static int fibonacci(int x, int y, long n) {
		// Write your code here.
		long[] dp = new long[(int)n+1];
		dp[0] = (long)x;
		dp[1] = (long)y;

		for(int i = 2 ; i < (int)n ; i++){
			dp[i] = (dp[i-1] + dp[i-2]);
		}
        if(dp[(int)n-1] < 0){
            return (int) dp[(int)n-1] + 1000000007;
        }
		return (int) dp[(int)n-1];
	}

    public static void main(String[] args) {

        int x = -1, y = -2;
        long n = 1;
        System.out.println(fibonacci(x, y, n));
    }

}
