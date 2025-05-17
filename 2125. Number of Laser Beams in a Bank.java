
class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int result = 0;
        for (String row : bank){
            boolean flag = false;
            int current = 0;
            for (Character ch : row.toCharArray()){
                if (ch == '1'){
                    flag = true;
                    current ++;
                }
            }
            if (flag){
                result += (prev * current);
                prev = current;
            }
        }
        return result;
    }
}
