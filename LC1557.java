import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        List<List<Integer>> g = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] found = new boolean[n];
        int[] indegree = new int[n];
        for(int i = 0 ; i < n ;i++)
        {
            found[i] = false;
            indegree[i] = 0;
            List<Integer> t = new ArrayList<>();
            g.add(t);
        }
        for (List<Integer> list : edges) {
            indegree[list.get(1)]++;
            g.get(list.get(0)).add(list.get(1));
        }
        for (int i = 0; i < n; i++) {
            if(!found[i] && indegree[i] == 0)
            {
                ans.add(i);
                bfs(g,i,found);
            }
            
        }
        return ans;
    }

    private void bfs(List<List<Integer>> graph, int source, boolean[] found) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        found[source] = true;
        while(!q.isEmpty())
        {
            int cur = q.poll();
            List<Integer> outedgesFromCur = graph.get(cur);
            for (Integer i : outedgesFromCur) {
                if(!found[i]){
                    q.add(i);
                    found[i] = true;
                }
            }
        }
    }
}
