class Solution {
public:
    int kthFactor(int n, int k) {
        vector<int> factors;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.push_back(i);
            }
        }
        int m = factors.size();
        if (k <= m) return factors[k - 1];
        for (int i = m - 1; i >= 0; i--) {
            int tmp = n / factors[i];
            if (tmp == factors[i]) continue;
            else{
                factors.push_back(n / factors[i]);
            }
        }
        if (k > factors.size()){
            return -1;
        }
        return factors[k - 1];
    }
};
