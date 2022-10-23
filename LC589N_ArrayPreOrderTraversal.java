import java.util.ArrayList;
import java.util.List;

public class LC589N_ArrayPreOrderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        nArraypreOrder(root,ans);
        return ans;
    }

    private void nArraypreOrder(Node root, List<Integer> ans) {
        if(root == null) return;
        
        ans.add(root.val);
        for(int i = 0 ; i< root.children.size() ; i++)
        {
            nArraypreOrder(root.children.get(i), ans);
        }
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}