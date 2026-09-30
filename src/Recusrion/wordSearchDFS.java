import java.util.*;

public class wordSearchDFS{

    //leetcode: https://leetcode.com/problems/word-search/

    public static boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            // Start DFS if the first letter matches
            if (board[i][j] == word.charAt(0)) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
    }
    return false;
}

private static boolean dfs(char[][] board, String word, int i, int j, int ch) {
    // Base Case: If we matched all characters successfully
    if (ch == word.length()) {
        return true;
    }

    // Boundary and matching checks
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(ch)) {
        return false;
    }

    // Mark the current cell as visited using a placeholder character
    char temp = board[i][j];
    board[i][j] = '#'; 

    // Explore all 4 directions (Down, Up, Right, Left)
    boolean found = dfs(board, word, i + 1, j, ch + 1) ||
                    dfs(board, word, i - 1, j, ch + 1) ||
                    dfs(board, word, i, j + 1, ch + 1) ||
                    dfs(board, word, i, j - 1, ch + 1);

    // Backtrack: Restore the original character for other search paths
    board[i][j] = temp;

    return found;
}


    public static void main(String[] args){
            char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
            };
            String word = "ABCCE8"; 

            System.out.println(exist(board , word)) ;
    }
}