import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
       long sum = arr.stream().mapToLong(x -> x).sum();
       long max = Long.MIN_VALUE;
       long min = Long.MAX_VALUE;
       for (Integer i : arr) {
            if(sum-i>max){
                max = sum-i;
            }
            if(sum-i<min){
                min = sum-i;
            }
       }
       System.out.println(min + " " + max);
    }

}

public class HR_MinMaxSum {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(new Integer[]{1,2,3,4,5});

        Result.miniMaxSum(arr);

    }
}
