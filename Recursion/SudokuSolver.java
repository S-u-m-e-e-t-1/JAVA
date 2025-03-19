public class SudokuSolver {
  public static void main(String[] args) {
    char[][] board = {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    SudokuSolver solver = new SudokuSolver();
    solver.solveSudoku(board);
    solver.printBoard(board);
  }

  public void solveSudoku(char[][] board) {
    solve(board);
  }

  private boolean solve(char[][] board) {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        if (board[row][col] == '.') {
          for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, col, num)) {
              board[row][col] = num;
              if (solve(board)) {
                return true;
              }
              board[row][col] = '.'; // reset on backtrack
            }
          }
          return false; // trigger backtracking
        }
      }
    }
    return true; // solution found
  }

  private boolean isValid(char[][] board, int row, int col, char num) {
    for (int i = 0; i < 9; i++) {
      if (board[row][i] == num || board[i][col] == num ||
          board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == num) {
        return false;
      }
    }
    return true;
  }

  private void printBoard(char[][] board) {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        System.out.print(board[row][col]);
        if (col < 8)
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}