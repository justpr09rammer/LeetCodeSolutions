
class Solution {
    public int[][] generateMatrix(int n) {
        int k = 1;
        int temp = n * n;
        int left = 0, right = n, top = 0, bottom = n;
        int[][] matrix = new int[n][n];
        boolean goRight = true, goLeft = false, goUp = false, goDown = false;
        while (k <= temp){
            if (goRight && k <= temp){
                for (int i = left; i < right; i ++){
                    matrix[top][i] = (k++);
                }
                goRight = false;
                goDown = true;
                top ++;
            }
            if (goDown && k <= temp){
                for (int i = top; i < bottom; i ++){
                    matrix[i][right - 1] = (k++);
                }
                goDown = false;
                goLeft = true;
                right -= 1;
            }
            if (goLeft && k <= temp){
                for (int i = right - 1; i >= left; i --){
                    matrix[bottom - 1][i] = (k++);
                }
                goLeft = false;
                goUp = true;
                bottom --;
            }
            if (goUp && k <= temp){
                for (int i = bottom - 1; i >= top; i --){
                    matrix[i][left] = (k++);
                }
                goUp = false;
                goRight = true;
                left ++;
            }
        }
        //printMatrix(matrix);
        return matrix;
    }
    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
