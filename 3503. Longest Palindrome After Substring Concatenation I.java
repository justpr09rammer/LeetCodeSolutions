
class Solution {
    public int longestPalindrome(String s, String t) {
        List<String> allCombinationS = new ArrayList<>();
        List<String> allCombinationT = new ArrayList<>();
        for (int i = 0; i < s.length(); i ++){
            for (int j = i; j < s.length(); j ++){
                allCombinationS.add(s.substring(i, j+1));
            }
        }
        for (int i = 0; i < t.length(); i ++){
            for (int j = i; j < t.length(); j ++){
                allCombinationT.add(t.substring(i, j+1));
            }
        }
        //System.out.println(allCombinationT);
        //System.out.println("break line");
        //System.out.println(allCombinationS);
        int result = -1;
        for (int i = 0; i < allCombinationS.size(); i ++){
            if (isPalindrome(allCombinationS.get(i))){
                result = Math.max(result, allCombinationS.get(i).length());
                //System.out.println(allCombinationS.get(i));
            }
            for (int j = 0; j < allCombinationT.size(); j ++){
                if (isPalindrome(allCombinationT.get(j))){
                    result = Math.max(result, allCombinationT.get(j).length());
                    //System.out.println(allCombinationT.get(j));
                }
                String concat = allCombinationS.get(i) + allCombinationT.get(j);
                if (isPalindrome(concat)){
                    result = Math.max(result, concat.length());
                    //System.out.println("concat ->" + concat);
                }
            }
        }
        return result;
    }
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
