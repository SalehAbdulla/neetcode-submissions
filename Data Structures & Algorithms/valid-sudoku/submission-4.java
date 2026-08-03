class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // iterate rows
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rowsSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
                if (Character.isDigit(board[i][j]) && rowsSet.contains(board[i][j])) return false;
                rowsSet.add(board[i][j]);
            }
            System.out.println();
        }

        System.out.println("-".repeat(30));

        // iterate cols 
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> colsSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                // System.out.print(board[j][i] + " ");
                if (Character.isDigit(board[j][i]) && colsSet.contains(board[j][i])) return false;
                colsSet.add(board[j][i]);
            }
            // System.out.println();
        }


        // iterate 3x3 boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char cell = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (Character.isDigit(cell) && boxSet.contains(cell)) return false;
                        boxSet.add(cell);
                    }
                }
            }
        }

        return true;
    }
}
