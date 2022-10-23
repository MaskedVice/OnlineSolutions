import java.util.HashSet;

public class LC965UniValuedBinaryTree {
    HashSet<Integer> n = new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        n.add(root.val);
        if(n.size()>1) return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
