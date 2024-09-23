public class LC55_JumpoGame {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        for (int i = n; i >= 0; i--) {
            if(i+nums[i] >= n) n = i;
        }
        return n == 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        LC55_JumpoGame obj = new LC55_JumpoGame();
        System.out.println(obj.canJump(nums));
    }
}
