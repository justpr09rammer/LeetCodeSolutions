
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = func(countAndSay(n - 1));
        return s;
    }
    private String func(String s){
        StringBuilder sb = new StringBuilder();
        char temp = s.charAt(0);
        int k = 1;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == temp){
                k ++;
            }
            else{
                sb.append(k);
                sb.append(temp);
                k = 1;
                temp = s.charAt(i);
            }
        }
        sb.append(k);
        sb.append(temp);
        return sb.toString();
    }
}
