
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();

        result.add(words[0]);
        int prev = groups[0];
        for (int i = 1; i < words.length; i ++){
            if (prev != groups[i]){
                result.add(words[i]);
                prev = groups[i];
            }
        }

        return result;

    }
}
