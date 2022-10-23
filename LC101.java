
public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode a, TreeNode b) {
        if(a ==null && b == null) return true;
        if(a ==null || b == null || a.val != b.val) return false;
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    public static void main(String[] args) {
        TreeNode h = new TreeNode(1);
        h.left = new TreeNode(2);
        h.right = new TreeNode(2);

        h.left.left = new TreeNode(2);

        h.right.left = new TreeNode(2);

        LC101 a = new LC101();
        a.isSymmetric(h);
    }
}
