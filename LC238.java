import java.util.Arrays;
import java.util.stream.IntStream;

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefixProducts = new int[n];
        int[] suffixProducts = new int[n];

        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            prefixProducts[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            suffixProducts[i] = suffixProduct;
            suffixProduct *= nums[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -1, 1, 0, -3, 3 };
        LC238 lc238 = new LC238();
        int[] ans = lc238.productExceptSelf(nums);
    }
}
