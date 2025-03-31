
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int start = (int) (n * 0.05);
        int end = n - start;
        double result = 0;
        for (int i = start; i < end; i++) {
            result += arr[i];
        }
        return result / (end - start);
    }
}
