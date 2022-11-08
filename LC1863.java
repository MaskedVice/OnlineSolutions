public class LC1863 {

    public static void main(String[] args) {
        LC1863 a = new LC1863();
        a.subsetXORSum(new int[]{5,1,6});
    }


    public int subsetXORSum(int[] nums) {
        int[] sum = new int[]{0};
        boolean[] a = new boolean[nums.length+1];
        Backtrack(a,0,nums.length,sum,nums);
        System.out.println(sum[0]);
        return sum[0];
    }

    private void Backtrack(boolean[] a, int k, int length, int[] sum,int[] nums) {
        boolean c[] = new boolean[length+1];
        int[] nc = new int[1];

        if(isSolution(k,length))
        {
            processSolution(a,length,sum,nums);
        }
        else{
            k++;
            constructCandidates(c,nc);
            for (int i = 0; i < nc[0]; i++) {
                a[k] = c[i];
                Backtrack(a,k,length,sum,nums);
            }
        }
    }

    private void processSolution(boolean[] a, int length, int[] sum, int[] nums) {
        int curXOR = 0;
        for (int i = 1; i <= length; i++) {
            {
                if(a[i])
                {
                    curXOR^=nums[i-1];
                }
            }
        }
        sum[0]+=curXOR;
    }

    private void constructCandidates(boolean[] c, int[] nc) {
        c[0] = true;
        c[1] = false;
        nc[0] = 2;
    }

    private boolean isSolution(int k, int length) {
        return k==length;
    }
}
