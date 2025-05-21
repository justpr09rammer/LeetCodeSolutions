class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[0].length; j ++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int row : rows){
            makeRowZero(matrix, row);
        }
        for (int col : cols){
            makeColumnZero(matrix, col);
        }
    }
    private void makeColumnZero(int[][] matrix, int col){
        for (int i = 0; i < matrix.length; i ++){
            matrix[i][col] = 0;
        }
    }
    private void makeRowZero(int[][] matrix, int row){
        for (int i = 0; i < matrix[0].length; i ++){
            matrix[row][i] = 0;
        }
    }
}
