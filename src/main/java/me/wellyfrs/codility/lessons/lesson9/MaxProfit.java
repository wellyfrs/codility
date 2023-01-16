package me.wellyfrs.codility.lessons.lesson9;

public class MaxProfit {

    public int solution(int[] A) {
        int minPrice = Integer.MAX_VALUE;
        int maxLocalProfit;
        int maxGlobalProfit = 0;

        for (int price: A) {
            minPrice = Math.min(minPrice, price);
            maxLocalProfit = price - minPrice;
            maxGlobalProfit = Math.max(maxGlobalProfit, maxLocalProfit);
        }

        return maxGlobalProfit;
    }

}
