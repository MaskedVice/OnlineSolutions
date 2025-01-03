public class LC2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (n * m != original.length) {
            return new int[0][0];
        }
        int[][] answer = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            answer[i / n][i % n] = original[i];
        }
        return answer;
    }

    public int[][] construct2DArraySlower(int[] original, int m, int n) {
        if(original.length!=m*n){
            return new int[0][0] ;
        }
        int[][] arr=new int[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[k];
                k++;
            }
        }return arr;
    }

    public static void main(String[] args) {
        LC2022 obj = new LC2022();
        int[] original = {1,2,3,4};
        int m = 4;
        int n = 1;
        int[][] ans = obj.construct2DArray(original,m,n);
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
