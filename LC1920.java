import java.util.Arrays;

public class LC1920 {

    public static void main(String[] args) {
        LC1920 a = new LC1920();
        a.buildArray(new int[]{0,2,1,5,3,4});
    }
    public int[] buildArray(int[] nums) {
        
        return Arrays.stream(nums)  // 15 is the size
        .mapToObj((int i) ->  nums[i])
        .mapToInt(Integer::intValue).toArray();
    }
}
