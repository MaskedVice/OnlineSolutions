/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class LC938 {
    public static int[] sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = new int[1];
        iOT(root,low,high);
        return sum[0];
    }
    public static void iOT(TreeNode root,int low,int high){
        if(root == null)
            return;
        iOT(root.left,low,high);
        
        if(root.val>=low && root.val<=high)
        {
            sum[0]+=root.val;
        }
        
        iOT(root.right,low,high);
    }
}