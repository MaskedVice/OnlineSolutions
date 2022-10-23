import java.util.ArrayList;
import java.util.List;

public class LC94Inorder {
    List<Integer>  ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root ==null)return new ArrayList<>();
        iot(root);
        return ans;
    }
    private  void iot(TreeNode root) {
        if(root==null) return;
        iot(root.left);
        ans.add(root.val);
        iot(root.right);
    }
    public static void main(String[] args) {
        TreeNode h = new TreeNode(1);
        h.right = new TreeNode(2);
        h.right.left = new TreeNode(3);
        LC94Inorder a = new LC94Inorder();
        System.out.println(a.inorderTraversal(h).toString());
    }
}
