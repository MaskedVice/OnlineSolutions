import java.util.Arrays;
import java.util.List;
public class HR_DiagonalDIfference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n - i - 1);
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(new Integer[]{1, 2, 3});
        List<Integer> l2 = Arrays.asList(new Integer[]{4, 5, 6});
        List<Integer> l3 = Arrays.asList(new Integer[]{9, 8, 9});
        List<List<Integer>> arr = Arrays.asList(l, l2, l3);
        System.out.println(diagonalDifference(arr));
    }
}
