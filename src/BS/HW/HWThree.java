package BS.HW;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] goods = new int[m];
        for (int i = 0; i < m; i++){
            goods[i] = sc.nextInt();
        }

        Arrays.sort(goods);
        int start = 0;
        int end = goods.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        while (start <= end){
            if (sum1 < sum2){
                sum1 += goods[start];
                start++;
            } else {
                sum2 += goods[end];
                end--;
            }
        }
        int res = sum1 > sum2 ? sum1: sum2;
        System.out.println(res);
    }
}
