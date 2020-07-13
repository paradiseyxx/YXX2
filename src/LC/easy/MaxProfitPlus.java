package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2020/5/12.
 *
 * 122. 买卖股票的最佳时机 II
 */
public class MaxProfitPlus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[5];
        for (int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }
        MaxProfitPlus maxProfitPlus = new MaxProfitPlus();
        System.out.println(maxProfitPlus.maxProfitPlus(prices));
    }

    public int maxProfitPlus(int[] prices){
        if (prices.length < 2){
            return 0;
        }else {
            int[][] dp = new int[prices.length][2];
            dp[0][0] = 0;
            dp[0][1] = -prices[0];
            for (int i = 1; i < prices.length; i++){
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            }
            return dp[prices.length - 1][0];
        }
    }

}
