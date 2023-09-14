import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static ArrayList<Integer> getStaleServerCount(int n, int[][] logData, List<Integer> queries, int x) {
        ArrayList<Integer>[] serverTimestamp = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            serverTimestamp[i] = new ArrayList<>();
        }
        for (int[] log : logData) {
            serverTimestamp[log[1]].add(log[0]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer q : queries) {
            int end = q;
            int start = q-x;
            int count = 0;
            for (int i = start; i <= end; i++) {
                if(serverTimestamp[i] !=null){
                    count+=serverTimestamp[i].size();
                }
            }
            result.add(n-count);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int x = 2;
        int q = 3;
        int[][] logData = {{3, 2},{4,3}, {2, 6}, {6, 3}};
        List<Integer> queries =   Arrays.asList(new Integer[] {3,2,6});

        ArrayList<Integer> result = getStaleServerCount(n, logData,queries, x);
        result.stream().forEach(System.out::println);
    }

}
