import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC1971 {

    public static void main(String[] args) {
        LC1971 a = new LC1971();
        a.validPath(6, new int[][] {{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5);
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] seen = new int[n+1];
        List<List<Integer>> graph = createGraph(n,edges,seen);
        boolean pathFound = checkPath(graph,source,destination,seen);
        return pathFound;
    }

    private boolean checkPath(List<List<Integer>> graph, int source, int destination,int[] seen) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        seen[source] = 1;
        while(!q.isEmpty())
        {
            int cur = q.poll();
            List<Integer> outedgesFromCur = graph.get(cur);
            for (Integer i : outedgesFromCur) {
                if(i==destination)
                {
                    return true;
                }
                else if(seen[i] == 0){
                    q.add(i);
                    seen[i] = 1;
                }
                
            }
        }
        return false;
    }

    private List<List<Integer>> createGraph(int size,int[][] edges, int[] seen) {
        List<List<Integer>> temp = new ArrayList<>(size);
        while(size>=0)
        {
            List<Integer> s = new ArrayList<>();
            temp.add(s);
            size--;
        }
        for (int[] edge : edges) {
            temp.get(edge[0]).add(edge[1]);
            temp.get(edge[1]).add(edge[0]);
        }
        for(int i = 0 ; i < seen.length ; i++)
        {
            seen[i] = 0;
        }
        return temp;
    }
}
