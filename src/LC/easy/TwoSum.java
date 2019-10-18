package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2019/10/17.
 *
 * 1. 两数之和
 */
public class TwoSum {
    public static void main(String args[]){
        int n = 5;
        int[] num = new int[n];
        TwoSum t = new TwoSum();
        Scanner arr = new Scanner(System.in);
        System.out.println("num:");
        for (int i = 0;i < num.length;i++){
            num[i] = arr.nextInt();
        }
        Scanner tar = new Scanner(System.in);
        System.out.println("targ:");
        int targ = tar.nextInt();
        t.twoSum(num,targ);
    }
    public int[] twoSum(int[] nums, int target){
        int[] twoSum = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[j] == target - nums[i]){
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }
        }
        if (twoSum[0] ==0 && twoSum[1] == 0 ){
            throw new IllegalArgumentException("NO two sum solution");
        }else {
            System.out.print("[");
            for (int t = 0;t < twoSum.length;t++){
                System.out.print(twoSum[t]);
                for (int m = t+1; m < twoSum.length;m++){
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
        return twoSum;
    }
}
