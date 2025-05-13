class Solution {
    private int MOD = 1000000007;
    public int lengthAfterTransformations(String s, int t) {
        long[] alphabet = new long[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabet[c - 'a']++;
        }
        while (t > 0) {
            long[] changes = new long[26];
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] > 0) {
                    if (i != 25) {
                        changes[i + 1] = (changes[i + 1] + alphabet[i]) % MOD;
                    } else {
                        changes[0] = (changes[0] + alphabet[i]) % MOD;
                        changes[1] = (changes[1] + alphabet[i]) % MOD;
                    }
                    changes[i] = (changes[i] - alphabet[i]) % MOD;
                }
            }
            for (int i = 0; i < 26; i++) {
                alphabet[i] = (alphabet[i] + changes[i]) % MOD;
                if (alphabet[i] < 0) {
                    alphabet[i] += MOD; 
                }
            }
            t--;
        }
        long result = 0;
        for (long element : alphabet) {
            result = (result + element) % MOD;
        }
        return (int) result;
    }
}
