import java.util.LinkedList;
import java.util.Queue;

public class LC189_RotateArray {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            while(k>0){
                int temp = nums[n-1];
                for(int i = n-1 ; i > 0 ; i--){
                    nums[i] = nums[i-1];
                }
                nums[0] = temp;
                k--;
            }
            System.err.println();
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        LC189_RotateArray obj = new LC189_RotateArray();
        obj.rotate(nums,k);}
}
