public class LC2044 {

    public static void main(String[] args) {
        LC2044 g = new LC2044();
        g.countMaxOrSubsets(new int[]{3,2,1,5});
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        int maxOrSubsets[] =new int[]{0};
        for (int i : nums) {
            maxOr|=i;
        }
        boolean[]a = new boolean[nums.length+1];
        Backtrack(a,0,nums.length,nums,maxOr,maxOrSubsets);
        return maxOrSubsets[0]/2;
    }

    private void Backtrack(boolean[] a, int k, int length, int[] nums,int maxOr, int[]  maxOrSubsets) {
        boolean[] c = new boolean[length+1];
        int[] nc = new int[1];
        if(isSolution(k,length))
        {
            processSolution(a,k,length,nums,maxOr,maxOrSubsets);
        }
        else{
            k++;
            constructCandidates(a,k,length,c,nc);
            for (int i = 0 ; i < nc[0] ; i++) {
                a[k] = c[i];
                Backtrack(a,k,length,nums,maxOr,maxOrSubsets);
            }
        }
    }
    private void processSolution(boolean[] a, int k, int length, int[] nums,int maxOr, int[] maxOrSubsets) {
        int curOr = 0;
        for (int i = 0; i < nums.length; i++) {
            if(a[i+1])
            {
                curOr|=nums[i];
            }
        }
        if(curOr == maxOr)maxOrSubsets[0]++;
    }
    private void constructCandidates(boolean[] a, int k, int length, boolean[] c, int[] nc) {
        c[0] = true;
        c[1] = false;
        nc[0] = 2;
    }
    private boolean isSolution(int k, int length) {
        return k==length;
    }
}
