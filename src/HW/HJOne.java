package HW;

import java.util.Scanner;

/**
 * Created by yxx on 2020/6/22.
 *
 * 字符串最后一个单词的长度
 */
public class HJOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HJOne hjOne = new HJOne();
        System.out.print(hjOne.hjone(s));
    }

    public int hjone(String s){
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' '){
            i--;
        }
        return s.length() - 1 - i;
    }
}
