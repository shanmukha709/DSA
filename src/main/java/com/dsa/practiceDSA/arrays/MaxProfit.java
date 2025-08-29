package com.dsa.practiceDSA.arrays;

public class MaxProfit {
    static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price : prices){
            if (price < minprice){
                minprice = price;
            }
            else {
                maxprofit = Math.max(maxprofit, price - minprice);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
