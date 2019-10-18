package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2019/10/17.
 *
 * 9. »ØÎÄÊı
 */
public class IsPalindrome {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("num:");
        int num = sc.nextInt();
        IsPalindrome isp = new IsPalindrome();
        System.out.println(isp.isPalindrome(num));
    }

    public boolean isPalindrome(int x) {
        int revertNum = 0;
        if (x == 0){
            return true;
        } else if (x < 0 || x % 10 == 0){
            return false;
        } else {
            while (x > revertNum){
                int num = x % 10;
                revertNum = revertNum * 10 + num;
                x = x / 10;
            }
            if (x == revertNum || x == revertNum / 10){
                return true;
            }else {
                return false;
            }
        }
    }
}
