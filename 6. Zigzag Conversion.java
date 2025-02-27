
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[][] matrix= new char[numRows][s.length()];
        StringBuilder sb = new StringBuilder();
        boolean goDown = true;
        int leftPointer = 0;
        int currentColumn = 0;
        while (leftPointer < s.length()) {
            if (goDown){
                for (int i = 0; i < numRows && leftPointer < s.length(); i++) {
                    matrix[i][currentColumn] = s.charAt(leftPointer);
                    leftPointer++;
                }
                goDown = false;
                currentColumn += 1;
            }
            for (int i = numRows - 2; i > 0 && leftPointer < s.length(); i--) {
                matrix[i][currentColumn] = s.charAt(leftPointer);
                currentColumn += 1;
                leftPointer++;
            }
            goDown = true;
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < currentColumn; j++) {
                if (matrix[i][j] != 0) {
                    sb.append(matrix[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
