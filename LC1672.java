import java.util.Arrays;

public class LC1672 {
    public int maximumWealth(int[][] accounts) {
        int max_Wealth = -1;
        for (int[] is : accounts) {
            int sum = Arrays.stream(is).sum();
            if(max_Wealth<sum )
            {
                max_Wealth = sum;
            }
        }
        return max_Wealth;
    }
}
