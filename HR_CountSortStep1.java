import java.util.Arrays;
import java.util.List;

public class HR_CountSortStep1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Integer[] ans = new Integer[100];
        for (Integer i : arr) {
            ans[i]++;
        }
        return Arrays.asList(ans);
    }
}
