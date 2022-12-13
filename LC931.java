public class LC931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] a = new int [matrix[0].length + 1];
        int[] sum = new int[]{Integer.MAX_VALUE};
        BackTrack(a,0,n,matrix,sum);
        return sum[0];
    }

    private void BackTrack(int[] a, int k, int n, int[][] matrix, int[] sum) {
        int[] c = new int[matrix[0].length+1];
        int [] nc = new int[]{0};

        if(isSolution(k,n))
        {
            processSolution(a,n,matrix,sum);
        }
        else
        {
            k++;
            constructCandidates(a,k,n,c,nc,matrix);

            for (int i = 0; i < nc[0]; i++) {
                a[k] = c[i];
                BackTrack(a, k, n, matrix,sum);
            }
        }
    }

    private void constructCandidates(int[] a, int k, int n, int[] c, int[] nc, int[][] matrix) {
        if(k<=1)
        {
            nc[0] = 1;

            int j = Integer.MAX_VALUE;
            for(int i = 0 ; i < matrix[0].length ; i++)
            {
                if(matrix[0][i]<j)
                {
                    j = matrix[0][i];
                    c[0] = i;
                }
            }
        }
        else
        {
            int j = 0;
            for(int i = a[k-1]-1 ; i <=a[k-1]+1 ; i++)
            {
                if(i>=0 && i <matrix[0].length)
                {
                    c[j++] = i;
                }
            }
            nc[0] = j;
        }
    }

    private void processSolution(int[] a,int n, int[][] matrix,int[] sum) {
        int thisSum = 0;
        for (int i = 1; i <=n; i++) {
            thisSum+=matrix[i-1][a[i]];
        }
        if(thisSum<sum[0])
        {
            sum[0] = thisSum;
        }
    }

    private boolean isSolution(int k, int n) {
        return k==n;
    }


    public static void main(String[] args) {
        int ans = new LC931().minFallingPathSum(new int [][]{{2,1,3},{6,5,4},{7,8,9}});
    }
}
