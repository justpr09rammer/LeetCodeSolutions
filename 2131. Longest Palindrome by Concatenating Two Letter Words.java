class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> wordsWithSameLetter = new HashMap<>();
        Map<String, Integer> sortedWords = new HashMap<>();
        Map<String, Integer> nonSortedWords = new HashMap<>();
        int differentLetterWordsCount = 0;
        int sameLetterWordCount = 0;
        for (String word : words) {
            if (isSameLetter(word)) {
                wordsWithSameLetter.put(word, wordsWithSameLetter.getOrDefault(word, 0) + 1);
            }
        }
        int sameLetterPairs = 0;
        boolean hasCenter = false;
        for (int count : wordsWithSameLetter.values()) {
            sameLetterPairs += count / 2;
            if (count % 2 == 1) hasCenter = true;
        }
        sameLetterWordCount = sameLetterPairs * 4 + (hasCenter ? 2 : 0);
        for (String word : words) {
            if (!isSameLetter(word)) {
                if (isSortedWord(word)) {
                    sortedWords.put(word, sortedWords.getOrDefault(word, 0) + 1);
                } 
                else {
                    nonSortedWords.put(word, nonSortedWords.getOrDefault(word, 0) + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            String sortedWord = entry.getKey();
            String reversed = new StringBuilder(sortedWord).reverse().toString();
            if (nonSortedWords.containsKey(reversed)) {
                int min = Math.min(entry.getValue(), nonSortedWords.get(reversed));
                differentLetterWordsCount += min * 4;
            }
        }
        return differentLetterWordsCount + sameLetterWordCount;
    }

    private boolean isSameLetter(String word) {
        return word.charAt(0) == word.charAt(1);
    }

    private boolean isSortedWord(String word) {
        return word.charAt(0) < word.charAt(1);
    }
}
