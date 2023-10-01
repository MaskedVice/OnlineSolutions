import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * HR_MaxMin
 */
public class HR_MaxMin {

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - k+1; i++) {
            List<Integer> temp = arr.subList(i, i+k);
            int diff = temp.get(k-1) - temp.get(0);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(100,200,300,350,400,401,402);
        System.out.println(maxMin(3, arr));
    }
}