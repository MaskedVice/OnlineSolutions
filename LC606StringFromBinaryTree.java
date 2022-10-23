public class LC606StringFromBinaryTree {
    String[] s = new String[]{""};
    public String tree2str(TreeNode root) {
        buildString(root,s);
        return s[0];
        
    }
    private void buildString(TreeNode root, String[] s) {
        if(root != null)
        {
            s[0]+=root.val;
        }
        else{
            return;
        }
        
        if(root.left!= null)
        {
            s[0] += "(";
            buildString(root.left,s);
            s[0] += ")";
        }
        if(root.right != null)
        {
            if(root.left == null)
            {
                s[0]+="()";
            }
            s[0]+="(";
            buildString(root.right,s);
            s[0]+=")";
        }
        
        System.out.println(s[0]);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.left.left = new TreeNode(4);
        head.right = new TreeNode(3);
        LC606StringFromBinaryTree a = new LC606StringFromBinaryTree();
        a.tree2str(head);
    }
}
