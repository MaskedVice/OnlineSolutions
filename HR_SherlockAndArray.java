import java.util.List;

public class HR_SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int leftSum = 0; 
        int rightSum = arr.parallelStream().reduce(0, Integer::sum);
        for(int i = 0; i < arr.size(); i++) {
            if(i != 0)
            {
            leftSum = leftSum + arr.get(i - 1);
            }
            rightSum = rightSum - arr.get(i);
            if(leftSum == rightSum)
            {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(2, 0, 0, 0);
        System.out.println(balancedSums(arr));
    }
}
