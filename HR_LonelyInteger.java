import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HR_LonelyInteger {
        /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        int res = 0;
        Map<Integer,Integer> count = new HashMap<>();
        for(Integer i : a){
            count.computeIfPresent(i, (k,v)->v+1);
            count.putIfAbsent(i,1);
        }
        for(Entry<Integer,Integer> e : count.entrySet()){
            if(e.getValue() ==1){
                res = e.getKey();
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        List<Integer> a = Arrays.asList(new Integer[]{1,2,3,4,3,2,1});
        int result = HR_LonelyInteger.lonelyinteger(a);
        System.out.println(result);
    }
}
