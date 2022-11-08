import java.util.Arrays;

public class LC79 {

    public static void main(String[] args) {
        LC79 a = new LC79();
        a.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean found = false;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i],Boolean.FALSE);
        }
        char[] w = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                found = checkPath(board,0,i,j,w,visited);
                if(found)
                {
                    return true;
                }
            }
            
        }
        return false;

    }

    private boolean checkPath(char[][] board, int k, int i, int j, char[] w, boolean[][] visited) {
        if(k == w.length)return true;
        if(i<0 || j<0 || i>=board.length || j>=board[i].length|| board[i][j] != w[k] || visited[i][j])return false;

        visited[i][j] = true;
        k++;
        if (checkPath(board, k, i-1, j, w, visited) || checkPath(board, k, i+1, j, w, visited) || checkPath(board, k, i, j-1, w, visited) || checkPath(board, k, i, j+1, w, visited))return true;
        visited[i][j] = false;
        return false;
  }
}
