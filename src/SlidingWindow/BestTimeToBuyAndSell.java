package SlidingWindow;

public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int lower = 0;
        int higher = 1;
        int maxProfit = 0;
        while(higher < prices.length){
            if(prices[higher] > prices[lower]){
                if(prices[higher] - prices[lower] > maxProfit)
                    maxProfit = prices[higher] - prices[lower];
            }else{
                lower = higher;
            }
            higher ++;
        }
        return maxProfit;

    }
/*
maxProfit = 0;
prices = [ 10 , 1 , 5 , 6 , 7 , 1 ]
                                lh

           prices[h] - rices[l] = 0;
           prices[h] - rices[l] = 4;
           prices[h] - rices[l] = 5;
           prices[h] - rices[l] = 6;

*/

}
