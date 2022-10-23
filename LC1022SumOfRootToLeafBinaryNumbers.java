public class LC1022SumOfRootToLeafBinaryNumbers {

    public static int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public static int dfs(TreeNode root, int val) {
        if (root == null) return 0;
        val = val * 2 + root.val;
        return root.left == root.right ? val : dfs(root.left, val) + dfs(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(0);
        head.right = new TreeNode(1);

        head.left.left = new TreeNode(0);
        head.left.right = new TreeNode(1);
        
        head.right.left = new TreeNode(0);
        head.right.right = new TreeNode(1);
        System.out.println(sumRootToLeaf(head));
    }
}
