import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC1466 {
    public static void main(String[] args) {
        LC1466 a = new LC1466();
        a.minReorder(6,new int[][]{{0,1},{1,3},{2,3},{4,0},{4,5}});
    }
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int[] conCreated = new int[1];  
        for(int i = 0 ; i < n ; i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            g.add(temp);
            visited[i] = false;
        }
        for (int[] edge : connections) {
            g.get(edge[0]).add(edge[1]);
        }
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i])
            {
                //dfs(source,target,graph,visted,connectionsCreated)
                dfs(i,g,visited,conCreated);
            }
        }
        return conCreated[0];
    }

    private void dfs(int start, ArrayList<ArrayList<Integer>> g, boolean[] visited, int[] conCreated) {
        if(!visited[start])
        {
            visited[start] = true;
            for (int c : g.get(start)) {
                if(!visited[c]){
                    boolean f = findPath(start, c, g)|| findPath(0, start, g);
                    if(f){
                        return;
                    }
                    {
                        if(!g.get(start).contains(c))
                            g.get(start).add(c);
                        if(!g.get(c).contains(start))
                            g.get(c).add(start);
                        conCreated[0]++;
                    }
                    dfs(c,g,visited,conCreated);
                }
            }
        }
    }

    private boolean findPath(int destination, int source , ArrayList<ArrayList<Integer>> g) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty())
        {
            int cur = q.poll();
            if(g.get(cur).contains(destination))
                return true;
            q.addAll(g.get(cur));
        }
        return false;
    }
}
