package LC.TOP;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/21.
 *
 * 11. 盛最多水的容器
 */
public class MaxArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] height = new int[sc.nextInt()];
        for (int i = 0; i < height.length; i++){
            height[i] = sc.nextInt();
        }
        MaxArea maxArea = new MaxArea();
        System.out.print(maxArea.maxArea(height));
    }

    public int maxArea(int[] height){
        //暴力
/*        int maxArea = 0;
        if (height.length < 2){
            return 0;
        }
        for (int i = 0; i < height.length - 1; i++){
            for (int j = i + 1; j < height.length; j++){
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;*/

        //双指针
        int i = 0;
        int j = height.length - 1;
        int res = 0;

        while (i < j){
            res = height[i] < height[j] ? Math.max(res, (j - i) * height[i++]) : Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
}
