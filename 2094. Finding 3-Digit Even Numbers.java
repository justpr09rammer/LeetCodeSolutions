
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        boolean[] booleans = new boolean[1000];
        int count = 0;
        int n = digits.length;
        for (int i = 0; i < n; i ++){
            if (digits[i] == 0){
                continue;
            }
            int temp = -1;
            for (int j = 0; j < n; j ++){
                if (i == j){
                    continue;
                }
                for (int k = 0; k < n ; k ++){
                    if (k == j || k == i || digits[k] % 2 != 0){
                        continue;
                    }
                    temp = 100 * digits[i] + 10 * digits[j] + digits[k];
                    if (!booleans[temp]) {
                        booleans[temp] = true;
                        count ++;
                    }
                }
            }
        }
        int[] list = new int[count];
        int k = 0;
        for (int i = 0; i < 1000; i ++){
            if (booleans[i]){
                list[k ++] = i;
            }
        }
        return list;
    }
}
