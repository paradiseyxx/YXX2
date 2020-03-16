package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/16.
 *
 * 35. ËÑË÷²åÈëÎ»ÖÃ
 */
public class SearchInsert {
    public static void main(String args[]){
        int[] nums = new int[5];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nums:");
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc1.nextInt();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("target:");
        int target = sc2.nextInt();
        SearchInsert searchInsert = new SearchInsert();
        System.out.println(searchInsert.searchInsert(nums,target));
    }

    public int searchInsert(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
