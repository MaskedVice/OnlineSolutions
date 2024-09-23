import java.util.ArrayList;

public class CN_PairSumInBST {
    public static ArrayList<ArrayList<Integer>> printNodesSumToS(TreeNode root, int s) {
        // Write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        return res;
    }

    static void inorder(TreeNode root, int s, ArrayList<ArrayList<Integer>> res) {
        if(root ==null){
            return;
        }

        inorder(root.left, s, res);
        if(root.left == null && root.right == null){
            return;
        } else if(root.left != null) {
            if(root.left.val + root.val == s){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(root.val);
                temp.add(root.left.val);
                res.add(temp);
            }
        } else if (root.right != null) {
            if(root.right.val + root.val == s){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(root.val);
                temp.add(root.right.val);
                res.add(temp);
            }
        }
        inorder(root.right, s, res);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> printNodesSumToSS = new ArrayList<>();
        inorder(root, 13, printNodesSumToSS);
        printNodesSumToSS.forEach(System.out::println);
    }

}

