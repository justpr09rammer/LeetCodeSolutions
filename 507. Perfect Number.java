
class Solution {
    public boolean checkPerfectNumber(int num) {
        int res = 0;
        for (int i = 1; i <= Math.sqrt(num); i ++){
            if (num % i == 0){
                if (i != num / i){
                    System.out.println(i);
                    res += i;
                    res += (num / i);
                    System.out.println(num / i);
                }
                else{
                    System.out.println(i);
                    res += i;
                }
            }
        }
        res -= num;
        return res == num;
    }
}
