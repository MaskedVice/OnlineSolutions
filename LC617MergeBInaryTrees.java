public class LC617MergeBInaryTrees {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2 == null)
        {
            return null;
        }
        else if(root2 ==null)
        {
            return root1;
        }
        else if(root1 ==null)
        {
            return root2;
        }
        else
        {
            root1.val = root1.val + root2.val;
        }
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);
        mergeTrees(root, root2);
    }
}
