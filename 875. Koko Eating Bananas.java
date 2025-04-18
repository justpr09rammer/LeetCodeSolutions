
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxx = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxx = Math.max(maxx, piles[i]);
        }
        int lowerBound = 1;
        int upperBound = maxx;
        while (lowerBound <= upperBound) {
            int guessedSpeed = lowerBound + (upperBound - lowerBound) / 2;
            long hoursWithGuessedSpeed = 0;
            for (int pile : piles) {                
                hoursWithGuessedSpeed += (pile / guessedSpeed);
                if (pile % guessedSpeed != 0) {
                    hoursWithGuessedSpeed ++;
                }
            }
            if (hoursWithGuessedSpeed <= h){
                upperBound = guessedSpeed - 1;
                result = Math.min(result, guessedSpeed);
            }
            else {
                lowerBound = guessedSpeed + 1;
            }
        }
        return result;
    }
}
