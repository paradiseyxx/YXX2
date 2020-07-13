package HW;

import java.util.Scanner;

/**
 * Created by yxx on 2020/6/24.
 *
 * ¼ÆËã×Ö·û¸öÊý
 */
public class HJTwo {
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        String s = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        String c = sc2.nextLine();

        HJTwo hjTwo = new HJTwo();
        System.out.println(hjTwo.hjtwo(s,c));
    }

    public int hjtwo(String s1, String s2){
        int num = 0;
        if (s1.equals("") || s1 == null || s2.equals("") || s2 == null){
            return num;
        }
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        char s5 = s4.charAt(0);
        for (int i = 0; i < s3.length(); i++){
            if (s3.charAt(i) == s5){
                num++;
            }
        }
        return num;
    }
}
