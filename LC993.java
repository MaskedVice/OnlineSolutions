import java.util.LinkedList;
import java.util.Queue;

public class LC993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean foundX = false;
        boolean foundY = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            foundX = false;
            foundY = false;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.val==x) foundX = true;
                if(node.val==y) foundY = true;
                if(node.left!=null&&node.right!=null){
                    if((node.left.val==x&&node.right.val==y)||(node.left.val==y&&node.right.val==x)) return false;
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(foundX&&foundY) return true;
        }
        return false;
    }
}
