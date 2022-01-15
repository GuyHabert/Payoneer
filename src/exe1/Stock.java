package exe1;
public class Stock {
    public static int maximumProfit(int ratesArray[]) {
        int lowestSoFar = ratesArray[0];
        int maxProffit = Integer.MIN_VALUE;

        for (int i = 1; i < ratesArray.length; i++) {
            if (ratesArray[i] > lowestSoFar) {
                maxProffit = Math.max(ratesArray[i] - lowestSoFar, maxProffit);
            } else {
                lowestSoFar = ratesArray[i];
            }
        }
        return maxProffit;
    }
}

