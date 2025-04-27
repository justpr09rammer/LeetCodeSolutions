class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int k = 1;
        int temp = matrix.length * matrix[0].length;
        int left = 0, right = matrix[0].length, top = 0, bottom = matrix.length;
        boolean goRight = true, goLeft = false, goUp = false, goDown = false;
        while (k <= temp){
            if (goRight && k <= temp){
                for (int i = left; i < right; i ++){
                    result.add(matrix[top][i]);
                    k ++;
                }
                goRight = false;
                goDown = true;
                top ++;
            }
            if (goDown && k <= temp){
                for (int i = top; i < bottom; i ++){
                    result.add(matrix[i][right - 1]);
                    k ++;
                }
                goDown = false;
                goLeft = true;
                right -= 1;
            }
            if (goLeft && k <= temp){
                for (int i = right - 1; i >= left; i --){
                    result.add(matrix[bottom - 1][i]);
                    k ++;
                }
                goLeft = false;
                goUp = true;
                bottom --;
            }
            if (goUp && k <= temp){
                for (int i = bottom - 1; i >= top; i --){
                    result.add(matrix[i][left]);
                    k ++;
                }
                goUp = false;
                goRight = true;
                left ++;
            }
        }
        return result;
    }
}

