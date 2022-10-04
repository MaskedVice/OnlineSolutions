import java.util.ArrayList;
import java.util.List;

public class LC590N_aryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> runner = new ArrayList<>();
        for (Node node : root.children) {
            while(!node.children.isEmpty())
            {
                node = node.children.get(0);
            }
            runner.add(node.val);
            node =null;
        }
        return runner;
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
