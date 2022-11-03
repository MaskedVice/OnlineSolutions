import java.util.LinkedList;
import java.util.Queue;

public class LC547 {
    public static void main(String[] args) {
        int[][] g = new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        LC547 a = new LC547();
        a.findCircleNum(g);
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int connectedNum = 0;
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i])
            {
                connectedNum++;
                bfs(i,isConnected,visited);
            }
        }
        return connectedNum;
    }

    private void bfs(int vertex, int[][] isConnected,boolean[] isvisited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(vertex);
        while(!q.isEmpty())
        {
            int curVertex = q.poll();
            int[] cur = isConnected[curVertex];
            for(int i = 0 ; i < cur.length ; i++)
            {
                if(cur[i] == 1 && isConnected[i][curVertex] == 1 && i!=curVertex && !isvisited[i])
                {
                    q.add(i);
                    isvisited[i] = true;
                    isvisited[curVertex] = true;
                }
            }
        }
        
    }
}
