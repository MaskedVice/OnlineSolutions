import java.util.ArrayList;
import java.util.List;

public class LC46 {
    public static void main(String[] args) {
        for (List<Integer> s : new LC46().permute(new int[]{1,2,3})) {
            System.out.println(s.toString());
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int[] a = new int [n+1];
        List<List<Integer>> perms = new ArrayList();
        BackTrack(a,0,n,nums,perms);
        return perms;
    }

    private void BackTrack(int[] a, int k, int n, int[] nums, List<List<Integer>> perms) {
        int[] c = new int [n+1];
        int nc[] = new int[1];
        if(k==n){
            List<Integer> t = new ArrayList();
            for (int i = 1; i <= n; i++) {
                t.add(nums[a[i]-1]);                
            }
            perms.add(t);
        }
        else{
            k++;
            constructCandidates(a,k,n,c,nc);
            for (int i = 0; i < nc[0]; i++) {
                a[k] = c[i];
                BackTrack(a, k, n, nums, perms); 
            }
        }
    }

    private void constructCandidates(int[] a, int k, int n, int[] c, int[] nc) {
        boolean[] inPerm = new boolean[n+1];
        for (int i = 1; i < inPerm.length; i++) {
            inPerm[i] = false;
        }
        for (int i = 1; i < k; i++) {
            inPerm[a[i]] = true;
        }
        nc[0] = 0;
        for (int i = 1; i < inPerm.length; i++) {
            if(!inPerm[i])
            {
                c[nc[0]++] = i;
            }
        }
    }
}
