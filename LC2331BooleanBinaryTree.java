public class LC2331BooleanBinaryTree {
    public static boolean evaluateTree(TreeNode root) {
        if(root.val == 1) return true;
        if(root.val == 0) return false;
        
        if(root.val == 3)
        {
            return (evaluateTree(root.left) && evaluateTree(root.right));
        }
        else if(root.val == 2)
        {
            return (evaluateTree(root.left) || evaluateTree(root.right));
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        System.out.println( evaluateTree(root));
    }
}