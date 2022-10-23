import java.util.ArrayList;
import java.util.List;

public class LC872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        getLeaves(root1,r1);
        List<Integer> r2 = new ArrayList<>(); 
        getLeaves(root2,r2); 
        return r1.equals(r2);
    }

    private void getLeaves(TreeNode root, List<Integer> r) {
        if(root == null)return;
        if(root.left == root.right && root.left == null)
        {
            r.add(root.val);
        }
        getLeaves(root.left, r);
        getLeaves(root.right, r);
    }
}
