package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2020/5/12.
 *
 * 121. 买卖股票的最佳时机
 */
public class MaxProfit {
    public static void main(String args[]){
        int[] prices = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(prices));
    }

    public int maxProfit(int[] prices){
        int len = prices.length;
        if (len < 2){
            return 0;
        }else {
            int[][] dp = new int[len][2];
            dp[0][0] = 0;
            dp[0][1] = - prices[0];
            for (int i = 1; i < len; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            }
            return dp[len - 1][0];
        }
    }
}
