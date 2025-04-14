
class Solution {
    public int findClosest(int x, int y, int z) {
        int differenceX = Math.abs(x - z);
        int differenceY = Math.abs(y - z);
        if (differenceX > differenceY) {
            return 2;
        }
        if (differenceX < differenceY) {
            return 1;
        }
        return 0;
    }
}
