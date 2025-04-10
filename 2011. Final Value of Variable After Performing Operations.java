class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int temp = 0;
        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                temp ++;
            }
            if (operation.equals("X--") || operation.equals("--X")) {
                temp --;
            }
        }
        return temp;
    }
}
