class Solution {
    public int maximumProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int element : nums) {
            if (element > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = element;
            }
            else if (element > secondMax) {
                thirdMax = secondMax;
                secondMax = element;
            }
            else if (element > thirdMax) {
                thirdMax = element;
            }
            if (element < firstMin) {
                secondMin = firstMin;
                firstMin = element;
            }

            else if (element < secondMin) {
                secondMin = element;
            }
        }

        return Math.max(firstMax * secondMax * thirdMax, firstMax * firstMin * secondMin);
    }
}
