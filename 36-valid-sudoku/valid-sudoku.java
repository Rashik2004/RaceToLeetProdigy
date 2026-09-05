class Solution {
    public boolean isValidSudoku(char[][] board) {
       for (int r = 0; r < 9; r++) {
            boolean[] seen = new boolean[10];
            for (int c = 0; c < 9; c++) {
                if (!isValidCell(board[r][c], seen)) {
                    return false;
                }
            }
        }
        for (int c = 0; c < 9; c++) {
            boolean[] seen = new boolean[10];
            for (int r = 0; r < 9; r++) {
                if (!isValidCell(board[r][c], seen)) {
                    return false;
                }
            }
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                boolean[] seen = new boolean[10];
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        char current = board[boxRow + r][boxCol + c];
                        if (!isValidCell(current, seen)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    private boolean isValidCell(char ch, boolean[] seen) {
        if (ch == '.') {
            return true;
        }
        int num = ch - '0';
        if (seen[num]) {
            return false; 
        }
        seen[num] = true;
        return true;
    }
}