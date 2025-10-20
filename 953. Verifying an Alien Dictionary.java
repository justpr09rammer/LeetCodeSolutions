class Solution {
    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        if (words.length == 1) {
            return true;
        }
        int pointer1 = -1, pointer2 = 0;
        while (pointer2 + 1 < words.length) {
            int idx = 0;
            pointer1 ++;
            pointer2 ++;
            StringBuilder previousWord = new StringBuilder(words[pointer1]);
            StringBuilder nextWord = new StringBuilder(words[pointer2]);
            if (map.get(previousWord.charAt(idx)) > map.get(nextWord.charAt(idx))) {
                return false;
            }
            else if (map.get(previousWord.charAt(idx)) < map.get(nextWord.charAt(idx))) {
                continue;
            }
            else {
                boolean flag = false;
                for (int j = 0; j < Math.min(previousWord.length(), nextWord.length()); j ++){
                    if (map.get(nextWord.charAt(j)) < map.get(previousWord.charAt(j))){
                        return false;
                    }
                    if (nextWord.charAt(j) != previousWord.charAt(j)){
                        flag = true;
                    }
                }
                if (!flag && previousWord.length() > nextWord.length()){
                    return false;
                }
            }
        }
        return true;
    }
}
