public class LC623AddOneRowToTree {
    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root == null)return null;
        
        if(depth == 1)
        {
            TreeNode n = new TreeNode(val);
            n.left = root;
            n.right = null;
            root = n;
        }
        else if(depth>2)
        {
            root.left = addOneRow(root.left,val,depth-1);
            root.right = addOneRow(root.right, val, depth-1);
        }
        else 
        {
                TreeNode l = new TreeNode(val);
                l.left = root.left;
                root.left = l;

                TreeNode r = new TreeNode(val);
                r.right = root.right;
                root.right = r;
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        addOneRow(root,5,4);
    }
}
