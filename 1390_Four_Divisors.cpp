class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int sum = 0;
        for (auto &element : nums){
            int temp = func(element);
            sum += temp;
        }
        return sum;
    }
    int func(int &n){
        int count = 0;
        int sum = 0;
        // bool flag = false;
        cout << "for " << n << endl;
        for (int i = 1; i <= sqrt(n); i ++){
            // if (i * i == n){
            //     sum -= i;
            //     flag = true;
            // }
            if (n % i == 0){
                if (n / i == i){
                    count --;
                    sum -= i;
                }
                count += 2;
                sum += (i + (n / i));
            }
        }
        if (count == 4){
            return sum;
        }
        return 0;
    }
};
