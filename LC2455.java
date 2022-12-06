import java.util.Arrays;

public class LC2455 {
    public int averageValue(int[] nums) {
        int[] subList = Arrays.stream(nums).filter(x -> (x%3==0) ).toArray();
        if(subList.length !=0)
        {
            return (int) Arrays.stream(subList).average().getAsDouble();
           
        }
        return 0;
    }
}
