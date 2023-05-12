public class Main {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{ 7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{37, 26, 14, 8, 1}));
    }
    public static int maxProfit(int[] priceses) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < priceses.length; i++) {
            if (priceses[i] < minPrice) {
                minPrice = priceses[i];
            } else if (priceses[i] - minPrice > profit) {
                profit = priceses[i] - minPrice;
            }
        }
        return profit;
    }
}