import javax.swing.text.html.parser.TagElement;

public class LC112PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null || targetSum<0)
        {
            return false;
        }
        if(root.left == null && root.right == null) return targetSum
        
        um == root.val;
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();


        System.out.println(hasPathSum(root, 0));
    }
}
