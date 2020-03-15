package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/15.
 *
 * 26. 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nums length:");
        int n = sc1.nextInt();
        int[] nums = new int[n];
        Scanner sc2 = new Scanner(System.in);
        System.out.println("nums:");
        for (int i = 0;i < nums.length;i++){
            nums[i] = sc2.nextInt();
        }

        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(rd.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums){
        if (nums == null){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
