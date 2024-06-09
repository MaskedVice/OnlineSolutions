/**
 * CN_DeleteLeafNodesWihValuex
 */
public class CN_DeleteLeafNodesWihValuex {

    public static BinaryTreeNode<Integer> deleteLeafNodes(BinaryTreeNode<Integer> root, int x) 
    {
        //Your code goes here
        BinaryTreeNode<Integer> temp = root;
        postOrder(temp,x);
        return temp;
    }

    static void postOrder(BinaryTreeNode<Integer> root , int x){
        if(root == null){
            return;
        }
        postOrder(root.left, x);
        postOrder(root.right, x);
        if(root.left != null && root.left.left == null && root.left.right == null && root.left.data == x){
            root.left = null;
        }
        if(root.right != null &&root.right.left == null && root.right.right == null && root.right.data == x){
            root.right = null;
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.left = new BinaryTreeNode<>(3);
        root.right = new BinaryTreeNode<>(3);
        root.left.left = new BinaryTreeNode<>(2);
        root.left.right = new BinaryTreeNode<>(3);
        root.right.right = new BinaryTreeNode<>(3);
        deleteLeafNodes(root, 3);
    }
}
class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) 
    {
        this.data = data;
    }
}