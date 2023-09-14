import java.util.ArrayList;
import java.util.Arrays;

public class LC1470 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,1,3,4,7};
        nums = shuffle(nums,3);
        Arrays.stream(nums).forEach(i -> System.out.print(i + " "));
    }

    private static int[] shuffle(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < k ; i++){
            list.add(nums[i]);
            list.add(nums[k+i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}