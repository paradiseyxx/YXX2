package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/16.
 *
 * 53. 最大子序和
 */
public class MaxSunArray {
    public static void main(String args[]){
        int[] nums = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("nums:");
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        MaxSunArray msa = new MaxSunArray();
        System.out.println(msa.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
