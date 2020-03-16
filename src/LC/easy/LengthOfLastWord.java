package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/16.
 *
 * 58. 最后一个单词的长度
 */
public class LengthOfLastWord {
    public static void main(String args[]){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("str:");
        String str = sc.nextLine();
        LengthOfLastWord lolw = new LengthOfLastWord();*/
        String str = "hello world";
        LengthOfLastWord lolw = new LengthOfLastWord();
        System.out.println(lolw.lengthOfLastWord(str));
    }

    public int lengthOfLastWord(String s){
        /*int count = 1;
        if (s.equals("")){
            return 0;
        }else {
            for (int i = s.length()-1; i >= 0; i--){
                if (s.charAt(i) != ' '){
                    for (int j = i - 1; j >= 0;j--){
                        while (s.charAt(j) != ' '){
                            count++;
                        }
                    }
                }
            }
        }*/
        return 0;
    }
}
