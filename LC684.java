import java.util.ArrayList;

class LC684 {
    public static void main(String[] args) {
        LC684 a = new LC684();
        a.findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}});
    }
    public int[] findRedundantConnection(int[][] edges) {
        boolean[] visited = new boolean[edges.length+1];
        boolean[] processed = new boolean[edges.length+1];
        int[] parent = new int[edges.length+1];

        ArrayList<ArrayList<Integer>> g = createGraph(edges.length, edges,visited,processed, parent);
        int[][] ans = new int[1][2];
        for( int i = 1 ; i <= edges.length ; i++)
        {
            if(!visited[i])
            {
                dfs(i,g,visited,processed,parent,ans);
            }
        }
        
        return ans[0];
    }

    private void dfs(int start,ArrayList<ArrayList<Integer>> g, boolean[] visited,boolean[]processed, int[] parent, int[][] ans) {
        if(!visited[start])
        {
            visited[start] = true;
            for (int c : g.get(start)) {
                if(!visited[c]){
                    parent[c] = start;
                    dfs(c, g, visited,processed, parent, ans);
                }
                else if(parent[start]!=c && !processed[c]){
                    ans[0] = new int[]{c,start};
                }
            }
            processed[start] = true;
        }
    }

    private ArrayList<ArrayList<Integer>> createGraph(int size,int[][] edges, boolean[] visited,boolean[]processed,int parent[]) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>(size);
        while(size>=0)
        {
            ArrayList<Integer> s = new ArrayList<>();
            temp.add(s);
            size--;
        }
        for (int[] edge : edges) {
            temp.get(edge[0]).add(edge[1]);
            temp.get(edge[1]).add(edge[0]);
        }
        for(int i = 0 ; i < size ; i++)
        {
            parent[i] = -1;
            visited[i] = false;
            processed[i] = false;
        }
        return temp;
    }
}
