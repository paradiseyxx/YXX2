package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/15.
 *
 * 27. ÒÆ³ıÔªËØ
 */
public class RemoveElement {

    public static void main(String args[]){
        int[] nums = new int[5];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nums:");
        for (int i = 0;i < nums.length; i++){
            nums[i] = sc1.nextInt();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("val:");
        int val = sc2.nextInt();
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(nums,val));
    }

    public int removeElement(int[] nums, int val){
        if (nums == null){
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length;i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
