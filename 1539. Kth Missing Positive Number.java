
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int missing = 0;
        int startingPoint = 1;
        while (missing < k && i < arr.length) {
            if (arr[i] == startingPoint) {
                i ++;
            }
            else {
                System.out.println(startingPoint);
                missing++;
            }
            startingPoint ++;
        }
        while (missing < k) {
            startingPoint ++;
            missing++;
        }
        return startingPoint - 1;
    }
}


