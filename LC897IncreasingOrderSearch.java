public class LC897IncreasingOrderSearch {
    private static TreeNode result;
    private static TreeNode pre;
    public static TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return result;
    }
    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (result == null) {
            result = root;
        } else {
            pre.right = root;
        }
        pre = root;
        root.left = null;
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        increasingBST(root);
    }
}
