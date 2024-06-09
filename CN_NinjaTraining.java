import java.util.Arrays;

public class CN_NinjaTraining {
    public static int ninjaTraining(int n, int p[][]) {
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1);
        }
        return f(n-1,n,p,dp);
    }

    static int f(int day, int last , int[][] p, int [][] dp){
        if(day==0){
            int max = 0;
            for (int i = 0; i < p[0].length; i++) {
                if(i != last){
                    max = Math.max(max,p[0][i]);
                }
            }
            return max;
        }
        if(dp[day][last] != -1){
            return dp[day][last];
        }
        int max = 0;

        for (int i = 0; i < p[0].length; i++) {
            if(i != last){
                int point = p[day][i] + f(day-1, i, p, dp);
                max = Math.max(max,point);
            }
        }
        return dp[day][last] = max;
    }

    public static void main(String[] args) {
        // try with this input 10
        // 94 74 84
        // 71 4 68
        // 70 12 17
        // 7 84 58
        // 59 69 2
        // 57 21 62
        // 74 54 15
        // 15 83 49
        // 97 70 90
        // 8 71 42
        int[][] p = {
            {94, 74, 84},
            {71, 4, 68},
            {70, 12, 17},
            {7, 84, 58},
            {59, 69, 2},
            {57, 21, 62},
            {74, 54, 15},
            {15, 83, 49},
            {97, 70, 90},
            {8, 71, 42}
        };
        System.out.println(ninjaTraining(10, p));

    }
}
