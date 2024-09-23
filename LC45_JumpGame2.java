public class LC45_JumpGame2 {
    public int jump(int[] nums) {

        int res = 0;
        int l = 0 , r = 0;
        while(r < nums.length - 1){
            int f = 0;
            for( int i = l ; i <=r ; i++){
                f = Math.max(f,i+nums[i]);
            }
            res++;
            l = r+1;
            r = f;
        }
        return res;
    }

    // public int jump(int[] nums) {
    //     if(nums.length == 1) return 0;
    //     int[] minJump = new int[]{Integer.MAX_VALUE};
    //     minJumps(nums, 0, 0, minJump);
    //     return minJump[0];
    // }

    // private void minJumps(int[]nums,int curIndex,int j, int[] minJump){
    //     if(curIndex >= nums.length - 1){
    //         minJump[0] = Math.min(j,minJump[0]);
    //         return;
    //     }

    //     if(nums[curIndex] == 0)
    //         return;

    //     int curNum = nums[curIndex];
        
    //     for( int i = 1 ; i <= curNum ; i++){
    //         minJumps(nums, curIndex + i, j+1, minJump);
    //     }
    // }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        LC45_JumpGame2 obj = new LC45_JumpGame2();
        System.out.println(obj.jump(nums));
    }
}
