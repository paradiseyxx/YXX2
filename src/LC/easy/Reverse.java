package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2019/10/17.
 *
 * 7. 整数反转
 */
public class Reverse {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("num:");
        int num = sc.nextInt();
        Reverse re = new Reverse();
        System.out.println(re.reverse(num));
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0){
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE && pop > 7){
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE && pop < -8){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
