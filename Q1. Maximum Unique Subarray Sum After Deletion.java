
class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        int maxNegative = Integer.MIN_VALUE;
        boolean isZeroExist = false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                isZeroExist = true;
            }
            if (num > 0){
                if (!set.contains(num)){
                    set.add(num);
                    sum += num;
                }
            }else maxNegative = Math.max(maxNegative, num);
        }
        if (isZeroExist && sum == 0){return 0;}
        if (!isZeroExist && sum == 0){
            return maxNegative;
        }
        return sum;
    }
}©leetcode
