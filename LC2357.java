import java.util.Arrays;

public class LC2357 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int counter = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                counter++;
                int toSub = nums[i];
                for(int j = i ; j< nums.length ; j++)
                {
                    nums[j] -= toSub;
                }
            }
        }   
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(new LC2357().minimumOperations(new int[]{1,5,0,3,5}));

        //Try counting unique lements next time
    }
}
