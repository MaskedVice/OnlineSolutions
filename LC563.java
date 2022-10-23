
public class LC563 {
    
    int result = 0;
    
    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }
    
    private int postOrder(TreeNode root) {
        if (root == null) return 0;
        
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        
        result += Math.abs(left - right);
        
        return left + right + root.val;
    }
    public static void main(String[] args) {
        LC563 a = new LC563();
        TreeNode h = new TreeNode(4);
        h.left = new TreeNode(2);
        h.right = new TreeNode(9);
        h.left.left = new TreeNode(3);
        h.left.right = new TreeNode(5);
        h.right.right = new TreeNode(7);
        a.findTilt(h);
    }
}
