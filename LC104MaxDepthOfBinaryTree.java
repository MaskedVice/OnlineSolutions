public class LC104MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int lHeight = 1 + maxDepth(root.left);
        int rHeight = 1 + maxDepth(root.right);
        
        return lHeight > rHeight ? lHeight : rHeight;
    }
}
