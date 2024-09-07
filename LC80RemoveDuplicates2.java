public class LC80RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 2 ; i < n ; i++){
            int cur = nums[i];
            if(cur == nums[i-1] && cur == nums[i-2]){
                n--;
                int j = i;
                while(j<nums.length-1){
                    nums[j] = nums[j+1];
                    j++;
                }
                i--;
            }
        }
        return n;
    }


    public static void main(String[] args) {
        LC80RemoveDuplicates2 obj = new LC80RemoveDuplicates2();
        int[] nums = {0,0,0,1,1,1,1,2,2,2,3};
        int ans = obj.removeDuplicates(nums);
        for(int i = 0 ; i < ans ; i++){
            System.out.println(nums[i]);
        }
    }
}
