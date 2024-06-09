import java.util.Arrays;

/**
 * HR_MinimizeDIff
 */
public class HR_MinimizeDIff {

        public static int minimizeIt(int[] A, int K) {
        // Write your code here.
        int mid = A.length/2;
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length ; i++){
            if(i >= mid){
                A[i]-=K;
                min = Math.min(A[i], min);
                max = Math.max(A[i], max);
            } else {
                A[i]+=K;
                min = Math.min(A[i], min);
                max = Math.max(A[i], max);
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int [] t = {10 ,4, 20, 19, 9, 4, 20, 14, 15, 10, 9, 15, 8 };
        System.out.println(minimizeIt(t, 9));
    }
}