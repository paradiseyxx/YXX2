package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/20.
 *
 * 70. 爬楼梯
 */
public class ClimbStairs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        ClimbStairs cs = new ClimbStairs();
        System.out.println(cs.climbstairs(n));
    }

    //动态规划
    public int climbstairs(int n){
        if (n == 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //暴力
    /*public int climbstairs(int n){
        //暴力
        return climb_stairs(0, n);
    }
    //暴力
    public int climb_stairs(int i, int n){
        if (i > n){
            return 0;
        }
        if (i == n){
            return 1;
        }
        return climb_stairs(i + 1, n) + climb_stairs(i + 2, n);
    }*/

}
