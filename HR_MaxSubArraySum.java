public class HR_MaxSubArraySum {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long res = 0;

        long max = arr[0];

        for(int i=1;i<n;i++)

        {

            max = Math.max(max + arr[i], arr[i]);

            res = Math.max(res,max);

        }

        return res;
	}
    public static void main(String[] args) {
        int [] t = {10 ,20, -30, 40, -50, 60};
        System.out.println(maxSubarraySum(t, t.length));
    }
}
