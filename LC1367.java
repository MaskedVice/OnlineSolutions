public class LC1367 {
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        return inOrder(head,root);
    }
    private boolean inOrder(ListNode head, TreeNode root) {
        if(root == null)
            return false;

        if(head.val == root.val){
            if(checkLLInBT(head,root))
                return true;
        }
        return inOrder(head,root.left) || inOrder(head,root.right);
    }

    private boolean checkLLInBT(ListNode head, TreeNode root) {
        if(head == null)
            return true;
        if(root == null)
            return false;
        if(head.val != root.val)
            return false;
        return checkLLInBT(head.next,root.left) || checkLLInBT(head.next,root.right);
    }
}
