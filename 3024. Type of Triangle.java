
class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        if (validTriangle(a,b,c)){
            if (a == b && b == c) {
                return "equilateral";
            }
            if (a == b || a == c || b == c){
                return "isosceles";
            }
            else return "scalene";
        }
        return "none";
    }
    private boolean validTriangle(int a, int b, int c){
        if (a + b <= c || a + c <= b || b + c <= a){
            return false;
        }
        return true;
    }
}
