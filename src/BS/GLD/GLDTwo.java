package BS.GLD;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class GLDTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0;i < n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.print(getNum(nums));
        }
    }

    public static int getNum(int[] nums){
        int[] copy = new  int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        Arrays.sort(copy);
        int n = nums.length;
        int max = 0;
        int i = 0;
        int j = 0;
        for (; i < n && j < n;){
            if (nums[i] != copy[j]){
                i++;
            }else {
                i++;
                j++;
            }
        }
        return n - j;
    }
}
