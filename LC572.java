import java.util.LinkedList;
import java.util.Queue;

public class LC572 {
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean ismatch = false;
        while(!q.isEmpty())
        {
            TreeNode c = q.poll();
            if(c.val == subRoot.val)
            {
                ismatch = checkMatch(c, subRoot);
            }
            if(ismatch) return true;
            if(c.left!=null)q.offer(c.left);
            if(c.right!=null)q.offer(c.right);
        }
        return false;
    }

    private boolean checkMatch(TreeNode getMatchHead, TreeNode subRoot) {
        if(getMatchHead == null && subRoot == null)
        {
            return true;
        }
        if(getMatchHead == null || subRoot == null || getMatchHead.val != subRoot.val) return false;
        return checkMatch(getMatchHead.left, subRoot.left) && checkMatch(getMatchHead.right, subRoot.right);
    }

}
