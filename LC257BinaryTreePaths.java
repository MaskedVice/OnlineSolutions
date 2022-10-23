import java.util.ArrayList;
import java.util.List;

public class LC257BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String s = "";
        dfs(root,ans,s);
        return ans;
    }

    private void dfs(TreeNode root, List<String> ans,String s) {
        if(root == null)
        {
            return;
        }
        if(root.left ==null && root.right == null)
        {
            ans.add(s+root.val);
            s="";
        }
        s+=root.val + "->";
        dfs(root.left,ans,s);
        dfs(root.right,ans,s);
        
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.left.right = new TreeNode(5);
        head.right = new TreeNode(3);
        LC257BinaryTreePaths a = new LC257BinaryTreePaths();
         System.out.println(a.binaryTreePaths(head).toString());
    }
}
