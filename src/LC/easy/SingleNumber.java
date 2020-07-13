package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2020/5/23.
 *
 * 136. 只出现一次的数字
 */
public class SingleNumber {
    public static void main(String args[]){
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }

    public int singleNumber(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

}
