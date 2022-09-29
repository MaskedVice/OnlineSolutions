import java.util.*;

public class Kitty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Graph g = new Graph(8);
        int[][] edges = new int[][] {{1,2},{1,3},{1,4},{3,5},{3,6},{3,7}};
        for(int[] e : edges)
        {
            g.insertEdge(e[0],e[1]);
        }
        g.init();
        int ans = g.findPath(2,4);
        int ans2 = g.findPath(2,5);
        int ans3 = g.findPath(4,5);
        System.out.println((2*4*ans + 2*5*ans2 + 4*5*ans3));
    }
}

class Graph {

    private int vertices;
    ArrayList<ArrayList<Integer>> graph;

    //Variables required in BFS
    private boolean[] isDiscoveredBFS,isProcessedBFS;
    private int[] parentBFS;
    private ArrayList<Integer> path;

    public Graph(int n) {
        this.vertices = n;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void insertEdge(int x,int y)
    {
        //Add edge (x,y)
        graph.get(x).add(y);
        //Add edge (y,x)
        graph.get(y).add(x);
    }

    public int findPath(int a,int b)
    {
        path = new ArrayList<>();
        findShortestPath(a,b,path);
        return path.size();
    }

    private void findShortestPath(int a, int b, ArrayList<Integer>path) {
        if(parentBFS[b] == -1 && a != b)
        {
            if(!path.contains(b))
            {
                path.add(b);
            }
            return;
        }
        else if(a == b)
        {
            
            return;
        }
        if(!path.contains(b))
        {
            path.add(b);
        } 
        findShortestPath(a, parentBFS[b],path);

    }
    public void init(){
        initialiseSearchBFS();
        BFS(1);
    }
    
    private void initialiseSearchBFS() {
        isDiscoveredBFS = new boolean[vertices+1];
        isProcessedBFS = new boolean[vertices+1];
        parentBFS = new int[vertices+1];

        for(int i = 1 ; i < vertices+1; i++)
        {
            isDiscoveredBFS[i] = isProcessedBFS[i] = false;
            parentBFS[i] = -1;
        }
    }

    public void BFS(int start)
    {
        breadthFirstSearch(start);
    }

    private void breadthFirstSearch(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        isDiscoveredBFS[start] = true;
        while(!q.isEmpty())
        {
            int cur = q.remove();
            isProcessedBFS[cur] = true;

            ArrayList<Integer> edges = graph.get(cur);

            for(int i : edges)
            {
                if(!isDiscoveredBFS[i])
                {
                    q.add(i);
                    isDiscoveredBFS[i] = true;
                    parentBFS[i] = cur;
                }
            }
        }
    }
}    