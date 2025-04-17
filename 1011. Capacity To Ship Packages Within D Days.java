
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        int lowerBound = 0;
        int result = Integer.MAX_VALUE;
        int upperBound = sum;

        while (lowerBound <= upperBound) {
            //System.out.println("lowerBound: " + lowerBound + " upperBound: " + upperBound);
            int weightGuess = lowerBound + (upperBound - lowerBound) / 2;
            //System.out.println();
            //System.out.println();
            //System.out.println("when weight guess ----------->  " + weightGuess);
            Boolean allCanBeCarried = true;
            int temp = 0;
            int day = 1;
            for (int weight : weights) {
                if (weight > weightGuess) {
                    lowerBound = weight;
                    //if this is true it means that there is an element which is greater than my bag lets say my ship cannot carry this weight,
                    // for the weight to be carried by the ship, it needs such a ship that carries this weight, so my lower ll be weight itself;

                    //System.out.println("broken one upper bound is " + upperBound);
                    //System.out.println("broken one lower bound is " + lowerBound);

                    allCanBeCarried = false;
                    break;
                }
                if (weight + temp > weightGuess) {
                    day += 1;
                    temp = 0;
                }
                temp += weight;
                //System.out.println("day " + day + " ----->  " + weight);
            }
            //System.out.println("all can be carried? " + allCanBeCarried);
            if (allCanBeCarried) {
                if (day <= days){
                    result = Math.min(result, weightGuess);
                    upperBound = weightGuess - 1;
                }
                else {
                    lowerBound = weightGuess + 1;
                }
            }
            //System.out.println(result);
            //System.out.println();
            //System.out.println();
        }
        return result;
    }
}
