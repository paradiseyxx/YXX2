package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/20.
 *
 * 69. x 的平方根
 */
public class MySqrt {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("i:");
        int i = sc.nextInt();
        MySqrt ms = new MySqrt();
        System.out.println(ms.mySqrt(i));
    }

    public int mySqrt(int x){
        //return (int)Math.pow(x, 0.5);
        //暴力
        /*int res = 0;
        if (x < 2){
            return x;
        }
        for (long i = 1; i < Integer.MAX_VALUE; i++){
            if (i * i <= x && (i + 1) * (i + 1) > x){
                res = (int)i;
                break;
            }
        }
        return res;*/
        //二分
        if (x < 2){
            return x;
        }
        int mid;
        long sqrt;
        int left = 2;
        int right = x / 2;
        while (left <= right){
            mid = left + (right - left)/ 2;
            sqrt = (long)mid * mid;
            if (sqrt > x){
                right = mid - 1;
            }else if (sqrt < x){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return right;
    }
}
