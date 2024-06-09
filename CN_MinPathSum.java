public class CN_MinPathSum {
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        return f(grid.length-1,grid[0].length-1,grid);
    }
    static int f(int i,int j, int[][] grid){
        if(i == 0 && j == 0){
            return grid[i][j];
        }
        if(i < 0 || j < 0){
            return 1000000;
        }

        int up = grid[i][j] + f(i-1, j, grid);
        int left = grid[i][j] + f(i, j-1, grid);
        
        return Math.min(up,left); 
    }

    public static void main(String[] args) {
        //try with 
        //2 3
        // 5 9 6
        // 11 5 2
        int[][] grid = {{5, 9, 6}, {11, 5, 2}};
        System.out.println(minSumPath(grid));
    }
}
