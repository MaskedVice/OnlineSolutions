import java.util.Arrays;
import java.util.stream.IntStream;

class LC217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
       IntStream s = Arrays.stream(nums);
        long l1 = s.distinct().count();
        long l2 = nums.length;

        return l1 ==l2;
    }



    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,1};
        LC217ContainsDuplicate l = new LC217ContainsDuplicate();
        System.out.println(l.containsDuplicate(nums));
    }
}