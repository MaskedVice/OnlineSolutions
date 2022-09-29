public class LC1379 {
    public static TreeNode iOT(TreeNode c, TreeNode t)
    {
        if(c == t)
        {
            return c;
        }
        TreeNode leftNode = iOT(c.left,t);
        TreeNode rightNode = iOT(c.right,t);
        if(leftNode == null)
            return rightNode;
        if(rightNode == null)
            return leftNode;
        return null;
    }

    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}