
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean flag = true;
                if (i - 1 >= 0 && flowerbed[i - 1] == 1) {
                    flag = false;
                }
                if (i + 1 < flowerbed.length && flowerbed[i + 1] == 1) {
                    flag = false;
                }
                if (flag) {
                    flowerbed[i] = 1;
                    count++;
                    if (count == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
