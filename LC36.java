import java.util.HashSet;
import java.util.Set;

public class LC36 {
    public boolean isValidSudoku(char[][] board) {
        //check rows of board
        for (int i = 0; i < board.length; i++) {
            Set<Integer> row = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] != '.'){
                    int cur = board[i][j] - '0';
                    if(row.contains(cur)){
                        return false;
                    }
                    row.add(cur);
                }
            }
        }
        
        //check columns of board
        for (int i = 0; i < board.length; i++) {
            Set<Integer> row = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if(board[j][i] != '.'){
                    int cur = board[j][i] - '0';
                    if(row.contains(cur)){
                        return false;
                    }
                    row.add(cur);
                }
            }
        }

        //check each 3X3 group
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board.length; j+=3) {
                if(!checkValid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkValid(char[][] board, int i, int j) {
        Set<Integer> row = new HashSet<>();
        for (int k = i; k < i+3; k++) {
            for (int l = j; l < j+3 ; l++) {
                if(board[k][l] != '.'){
                    int cur = board[k][l] - '0';
                    if(row.contains(cur)){
                        return false;
                    }
                    row.add(cur);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{  {'.','.','.','.','5','.','.','1','.'},
                                        {'.','4','.','3','.','.','.','.','.'},
                                        {'.','.','.','.','.','3','.','.','1'},
                                        {'8','.','.','.','.','.','.','2','.'},
                                        {'.','.','2','.','7','.','.','.','.'},
                                        {'.','1','5','.','.','.','.','.','.'},
                                        {'.','.','.','.','.','2','.','.','.'},
                                        {'.','2','.','9','.','.','.','.','.'},
                                        {'.','.','4','.','.','.','.','.','.'}};
        System.out.println(new LC36().isValidSudoku(board));
    }
}
