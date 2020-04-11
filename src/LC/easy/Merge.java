package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/21.
 *
 * 88. 合并两个有序数组
 */
public class Merge {
    public static void main(String args[]){
        int[] nums1 = new int[100];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int[] nums2 = new int[]{2,5,6};
        Merge merge = new Merge();
        //使用额外数组
        /*int[] res = merge.merge(nums1, nums1.length, nums2, nums2.length);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i]);
        }*/
        merge.merge(nums1, 3, nums2, nums2.length);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n){
        //使用额外数组
        /*int[] res = new int[m + n];
        int i = m - 1;
        int j = n - 1;
        int len = m + n - 1;
        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]){
                res[len] = nums1[i];
                i--;
            }else {
                res[len] = nums2[j];
                j--;
            }
            len--;
        }
        if (i > j){
            System.arraycopy(nums1, 0, res, 0,  i + 1);
        }else {
            System.arraycopy(nums2, 0, res, 0, j + 1);
        }
        return res;*/
        int i = m - 1;
        int j = n - 1;
        int len = m + n - 1;
        while (i >= 0 && j >= 0){
            nums1[len--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        System.arraycopy(nums2, 0, nums1, 0,j + 1);
        for (int k = 0; k < m + n; k++){
            System.out.print(nums1[k]);
        }
    }
}
