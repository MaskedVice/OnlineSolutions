public class LC108SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = createBST(nums,0,nums.length-1);
        return root;
        
    }

    private TreeNode createBST(int[] nums, int i, int j) {
        if(i>j)return null;
        int mid =i + (j-i)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, i, mid-1);
        root.right = createBST(nums, mid+1, j);
        return root;
    }

    public static void main(String[] args) {
        LC108SortedArrayToBST a = new LC108SortedArrayToBST();
        a.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
