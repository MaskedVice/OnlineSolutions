import java.util.stream.IntStream;

public class CN_ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums, int l) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
        int prod = IntStream.of(arr).reduce(1,(x,y)->x*y) % 1000000007;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  prod % arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] res = getProductArrayExceptSelf(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
