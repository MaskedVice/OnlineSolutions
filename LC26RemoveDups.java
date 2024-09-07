public class LC26RemoveDups {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for ( int i = 1 ; i < nums.length-1 ; i++){
            if(nums[i] != nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        LC26RemoveDups obj = new LC26RemoveDups();
        int[] nums = {0,0,1,1,1,1,2,3,4,4};
        int ans = obj.removeDuplicates(nums);
        for(int i = 0 ; i < ans ; i++){
            System.out.println(nums[i]);
        }
    }
}
