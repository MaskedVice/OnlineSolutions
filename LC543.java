public class LC543 {
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        dia(root,max);
        return max[0];
    }
    private int dia(TreeNode root, int[] max) {
        if(root == null) return 0;
        int leftdia = dia(root.left,max);
        int rightdia = dia(root.right,max);
        max[0] = Math.max(max[0], leftdia + rightdia);
        
        return Math.max(leftdia, rightdia) + 1;
    }
}
