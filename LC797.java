import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class LC797 {
    public static void main(String[] args) {
        LC797 b = new LC797();
        b.allPathsSourceTarget(new int[][] {{4,3,1},{3,2,4},{3},{4},{}});
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int source = 0;
        int target = graph.length-1;
        int[] a = new int[graph.length+1];
        List<List<Integer>> paths = new ArrayList();
        GraphData g = new GraphData(source, target, graph, paths);
        BacktrachGrapthPaths(a,0,graph.length,g);
        for (List<Integer> list : paths) {
            System.out.println(list.toString());    
        }
        
        return g.paths;
    }

    private void BacktrachGrapthPaths(int[] a, int k, int length, GraphData g) {
        int[] c = new int[length+1];
        int[] nc = new int[1];

        if(isSolution(a,k,g))
        {
            processSolution(a,k,g);
        }
        else{
            k++;
            constructCandidates(a,k,length,c,nc,g);
            for (int i = 0; i < nc[0]; i++) {
                a[k] = c[i];
                BacktrachGrapthPaths(a, k, length, g);
            }
        }
    }

    private void constructCandidates(int[] a, int k, int length, int[] c, int[] nc, GraphData g) {
        boolean[] inPath = new boolean[length];
        for (int i = 0; i < length; i++) {
            inPath[i] = false;
        }
        for (int i = 0; i < k; i++) {
            inPath[a[i]] = true;
        }
        if(k==1)
        {
            nc[0] = 1;
            c[0] = g.source;
        }
        else{
            nc[0] = 0;
            int[] possibleEdges = g.graph[a[k-1]];
            for (int i = 0; i < possibleEdges.length; i++) {
                if(!inPath[possibleEdges[i]])
                {
                    c[nc[0]++] = possibleEdges[i]; 
                }
            }
        }
    }

    private void processSolution(int[] a, int k, GraphData g) {
        List<Integer> l = Arrays.stream(a).limit(k+1).skip(1).boxed().collect(Collectors.toList());
        g.paths.add(l);
    }

    private boolean isSolution(int[] a, int k, GraphData g) {
        return a[k] == g.target;
    }
}

class GraphData{
    int source;
    int target;
    int[][] graph;
    List<List<Integer>> paths;
    
    public GraphData(int source, int target, int[][] graph, List<List<Integer>> paths) {
        this.source = source;
        this.target = target;
        this.graph = graph;
        this.paths = paths;
    }
}
