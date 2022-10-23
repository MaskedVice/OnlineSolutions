public class LC110 {
    public boolean isBalanced(TreeNode root) {
        boolean[] isBalanced = new boolean[]{true};
        checkHeight(root,isBalanced);
        return isBalanced[0];
        
    }

    private int checkHeight(TreeNode root ,boolean[] ib) {
        if(root == null) return 0;
        int leftt= checkHeight(root.left,ib);
        int rightt = checkHeight(root.right,ib);
        if(Math.abs(leftt-rightt)>1)
        {
            ib[0] = false;
        }
        return 1 + Math.max(leftt, rightt);
    }

    public static void main(String[] args) {
        TreeNode h = new TreeNode(1);
        h.left = new TreeNode(2);
        h.right = new TreeNode(2);
        h.left.left = new TreeNode(3);
        h.left.right = new TreeNode(3);
        h.left.left.left = new TreeNode(4);
        h.left.left.right = new TreeNode(4);
        LC110 a = new LC110();
        a.isBalanced(h);
    }
}
