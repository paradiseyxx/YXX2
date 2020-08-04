package BS.HW;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWTestTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first == last || first == i){
                sb.append(c);
            }
        }
        System.out.print(sb.toString());
    }
}
