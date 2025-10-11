
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checking rows
        for (int i = 0; i < 9; i ++){
            Set<Integer> set = new HashSet<>();
            boolean flag = true;
            for (int j = 0; j < 9; j ++){
                if (board[i][j] != '.'){
                    if (set.contains(board[i][j]- '0')){
                        return false;
                    }
                    else set.add(board[i][j]- '0');
                }

            }
        }
        //checking columns
        for (int i = 0; i < 9; i ++){
            Set<Integer> set = new HashSet<>();
            boolean flag = true;
            for (int j = 0; j < 9; j ++){
                if (board[j][i] != '.'){
                    if (set.contains(board[j][i]- '0')){
                       return false;
                    }
                    else set.add(board[j][i]- '0');
                }
            }
        }
        //checking subsquares
        for (int i = 0; i < 9; i += 3){
            for (int j = 0; j < 9; j += 3){
                Set<Integer> set = new HashSet<>();
                for (int k = i; k < i + 3; k ++){
                    for (int m = j; m < j + 3; m ++){
                        if (board[m][k] != '.'){
                            if (set.contains(board[m][k] - '0')){
                                return false;
                            }
                            else set.add(board[m][k] - '0');
                        }
                    }
                }
            }
        }

        return true;

    }
}
