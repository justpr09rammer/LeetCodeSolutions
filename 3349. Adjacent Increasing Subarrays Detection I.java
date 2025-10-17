class Solution {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (n == 1 || k == 1) {
            return true;
        }
        if (n == 2) {
            return nums.get(1) > nums.get(0);
        }
        for (int i = 0; i < n - k; i++) {
            int previous = nums.get(i);
            boolean flag1 = false;
            int count = 1;
            int j;
            for (j = i + 1; j < i + k; j++) {
                int next = nums.get(j);
                if (next > previous) {
                    count++;
                    previous = next;
                } else {
                    count = 1;
                    previous = next;
                    break;
                }

                if (count == k) {
                    flag1 = true;
                    break;
                }
            }
            if (flag1) {
                if (j + 1 < n) {
                    int m = j + 1;
                    int prev = nums.get(m);
                    count = 1;  
                    for (int t = m + 1; t < m + k; t++) {
                        if (t < n) { 
                            int next = nums.get(t);
                            if (next > prev) {
                                count++;
                                prev = next;
                            } else {
                                count = 1;
                                prev = next;
                                break;
                            }
                            if (count == k) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
