public class CN_Triangle {
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int m = triangle[n-1].length;
        return f(n-1,m-1,triangle);
    }

    static int f(int i , int j , int[][] t){
        if(i ==0 && j == 0) return t[i][j];

        if(i<0 || j < 0) return 100000000;

        int left = t[i][j];
        if(j>0){
            left += f(i,j-1,t);
        } else {
            left = 100000000;
        }
        
        int dia = t[i][j];
        if(i > 0 && j > 0){
            dia += f(i-1,j-1,t);
        } else {
            dia = 100000000;
        }

        return Math.min(left, dia);
    }
    public static void main(String[] args) {
        //call function on 
        // 2 
        // 3 4
        // 6 5 7
        // 4 1 8 3
        int[][] triangle = {
            {2},
            {3, 4},
            {6, 5, 7},
            {4, 1, 8, 3}
        };
        int n = triangle.length;
        int result = minimumPathSum(triangle, n);
        System.out.println("Minimum path sum: " + result);
    }
}
