import java.util.ArrayList;
import java.util.List;

public class LC78 {

    public static void main(String[] args) {
        LC78 d = new LC78();
        d.subsets(new int[]{1,2,3});
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean [] a = new boolean[nums.length+1];
        Backtrack(a,0,nums.length,nums,res);
        for (List<Integer> r : res) {
            System.out.println(r.toString());
        }
        return res;   
    }

    private void Backtrack(boolean[] a, int k, int length, int[] nums, List<List<Integer>> res) {
        boolean[] c = new boolean[length+1];
        int[]nc = new int[1];

        if(isSolution(k,length))
        {
            processSolution(a,k,length,nums,res);
        }
        else{
            k++;
            constructCandidates(a,k,length,c,nc);
            for (int i = 0; i < nc[0]; i++) {
                a[k]=c[i];
                Backtrack(a, k, length, nums,res);
            }
        }

    }

    private void constructCandidates(boolean[] a, int k, int length, boolean[] c, int[] nc) {
        c[0] = true;
        c[1] = false;
        nc[0] = 2;
    }

    private void processSolution(boolean[] a, int k, int length, int[] nums, List<List<Integer>> res) {
        List<Integer> t = new ArrayList();
        for (int i = 1; i <= length; i++) {
            if(a[i])
            {
                t.add(nums[i-1]);
            }
        }
        if(!res.contains(t))
        {
            res.add(t);
        }
    }

    private boolean isSolution(int k, int length) {
        return k==length;
    }
}
