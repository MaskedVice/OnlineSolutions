import java.util.Arrays;

public class LC27RemoveEleemnt {
    // public int removeElement(int[] nums, int val) {
    //     int cnt = Arrays.stream(nums).filter(x-> x == val).count();
    //     int i,j = nums.length-1;
    //     for(i = 0 ; i < j ; i++){
    //         if(nums[i] == val){
    //             while(nums[j] == val && i < j){
    //                 j--;
    //             }
    //             nums[i] = nums[j--];
    //         }
    //     }
    //     return i+1;
    // }

    public static void main(String[] args) {
        LC27RemoveEleemnt obj = new LC27RemoveEleemnt();
        int[] nums = {1};
        int val = 2;
        // System.out.println(obj.removeElement(nums,val));
    }
}
