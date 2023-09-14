import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.List;

public class HR_SAlesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer it : ar) {
            map.computeIfPresent(it, (k,v) ->v+1);
            map.putIfAbsent(it, 1);
        }
        for (Entry<Integer,Integer> Entry : map.entrySet()) {
            int countPair = Entry.getValue();
            while(countPair - 2 >= 0) {
                pairs++;
                countPair-=2;
            }
                
        }
        return pairs;
    }

    public static void main(String[] args) {
        int n = 9;
        List<Integer> ar = Arrays.asList(new Integer[]{10,20,20,10,10,30,50,10,20});
        System.out.println(sockMerchant(n, ar));
    }
}
