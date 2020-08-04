package LC.TOP;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YXX on 2020/7/18.
 *
 * 4. 寻找两个正序数组的中位数
 */
public class FindMedianSortedArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[sc.nextInt()];
        for (int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[sc.nextInt()];
        for (int i = 0; i < nums2.length; i++){
            nums2[i] = sc.nextInt();
        }
        FindMedianSortedArrays fmsa = new FindMedianSortedArrays();
        System.out.print(fmsa.findMedianSortedArrays(nums1,nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        //暴力
/*        int len1 = 0;
        int len2 = 0;
        if (nums1 == null){
            len1 = 0;
            len2 = nums2.length;
        }else if (nums2 == null){
            len1 = nums1.length;
            len2 = 0;
        }else {
            len1 = nums1.length;
            len2 = nums2.length;
        }
        int n = len1 + len2;
        int[] nums = new int[n];
        System.arraycopy(nums1, 0, nums,0, len1);
        System.arraycopy(nums2, 0, nums, len1, len2);
        Arrays.sort(nums);

        if (n == 1){
            int num0 = nums[0];
            double d0 = num0;
            return num0;
        }
        int num1 = nums[n / 2];
        int num2 = nums[n / 2 - 1];
        double d1 = num1;
        double d2 = num2;
        double d3 = (d1 + d2) / 2;
        if (n % 2 == 1){
            return d1;
        }else {
            return d3;
        }*/

        //折半删除
        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1 + len2;
        int left = (total + 1) / 2;
        int right = (total + 2) / 2;

        return (findK(nums1,0, len1 - 1, nums2, 0, len2 - 1, left) + findK(nums1, 0, len1 - 1, nums2, 0, len2 - 1, right)) / 2.0;
    }

    public int findK(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k){
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;

        if (len1 > len2){
            return findK(nums2, start2, end2, nums1, start1, end1, k);
        }
        if (len1 == 0){
            return nums2[start2 + k - 1];
        }
        if (k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }

        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]){
            return findK(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        }else {
            return findK(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }
}
