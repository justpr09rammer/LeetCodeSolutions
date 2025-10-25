class Solution {
public:
    int totalMoney(int n) {
        int weeks = n / 7;
        int sum = 0;
        int i = 1;
        for (i = 1; i <= weeks; i++) {
            sum += (7 + i - 1) * (7 + i) / 2 - (i - 1) * i / 2;
            //sum +=  func(7 + i - 1, i - 1);
        }
        for (int j = 0; j < (n % 7); j++) {
            sum += (i ++);
        }

        return sum;
    }
};
