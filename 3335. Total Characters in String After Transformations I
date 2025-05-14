class Solution {
    private long[] alphabet = new long[26];
    private final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {

        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            alphabet[c - 'a'] ++;
        }
        //print();
        long result = 0;
        while (t > 0) {
            long[] temp = new long[26];
            for (int i = 0; i < alphabet.length; i++) {
                //char ch = (char) ('a' + i);
                //System.out.println(ch);
                if (alphabet[i] > 0){
                    if (i != 25){
                        temp[i + 1] = alphabet[i] % MOD;
                    }
                    else {
                        temp[0] = (temp[0] + alphabet[25]) % MOD;
                        temp[1] = (temp[1] + alphabet[25]) % MOD;
                    }
                }
            }
            //System.out.println("t = " + t);
            //print();
            alphabet = temp;
            t--;
        }
        for (long element : alphabet){
            result = (result + element) % MOD;
        }
        return (int) result;
    }

    void print() {
        for (int i = 0; i < alphabet.length; i++) {
            char currentChar = (char)('a' + i);
            System.out.println(currentChar + " -> " + alphabet[i]);
        }
        System.out.println();
    }
}
