class Solution {
    public boolean exist(char[][] board, String word) {
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exist(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }
     public boolean exist(char[][] board, int i, int j, int depth, String word) {
        if (i >= 0 && j >= 0 && i < board.length && j < board[0].length) {
            if (board[i][j] != word.charAt(depth)) return false;
            if (depth == word.length() - 1) return true;
            char value = board[i][j];
            board[i][j] = Character.MIN_VALUE;
            boolean exist = exist(board, i + 1, j, depth + 1, word)
                    || exist(board, i - 1, j, depth + 1, word)
                    || exist(board, i, j + 1, depth + 1, word)
                    || exist(board, i, j - 1, depth + 1, word);
            board[i][j] = value;
            return exist;
        }
        return false;
    }
}