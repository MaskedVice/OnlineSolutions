import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAns = 0;
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>(n);
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }
        for (List<Integer> query : queries) {
            if(query.get(0) == 1){
                int idx = (query.get(1)^lastAns) % n;
                arr.get(idx).add(query.get(2)); 
            } 
            else {
                int idx = (query.get(1)^lastAns) % n;
                lastAns = arr.get(idx).get(query.get(2) % arr.get(idx).size());
                ans.add(lastAns);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> query = Arrays.asList(1,0,5);
        queries.add(query);
        query = Arrays.asList(1,1,7);
        queries.add(query);
        query = Arrays.asList(1,0,3);
        queries.add(query);
        query = Arrays.asList(2,1,0);
        queries.add(query);
        query = Arrays.asList(2,1,1);
        queries.add(query);
        List<Integer> ans = dynamicArray(2, queries);
        System.out.println(ans);
    }
}
