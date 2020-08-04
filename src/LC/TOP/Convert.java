package LC.TOP;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/19.
 *
 * 6. Z ×ÖÐÎ±ä»»
 */
public class Convert {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int row = sc.nextInt();
        Convert convert = new Convert();
        System.out.print(convert.convert(s, row));
    }

    public String convert(String s, int numRows){
         if (numRows == 1){
             return s;
         }
         int len = Math.min(numRows, s.length());
         String[] rows = new String[len];
         for (int i = 0; i < len; i++){
             rows[i] = "";
         }
         int loc = 0;
         boolean down = false;

         for (int i = 0; i < s.length(); i++){
             rows[loc] += s.charAt(i);
             if (loc == 0 || loc == numRows - 1){
                 down = !down;
             }
             loc += down ? 1 : -1;
         }

         String ans = "";
         for (String row : rows){
             ans += row;
         }
         return ans;
    }
}
