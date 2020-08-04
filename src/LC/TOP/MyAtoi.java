package LC.TOP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by YXX on 2020/7/20.
 *
 * 8. 字符串转换整数 (atoi)
 */
public class MyAtoi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MyAtoi myAtoi = new MyAtoi();
        System.out.print(myAtoi.myAtoi(s));
    }

    final static Pattern pattern = Pattern.compile("[-+]??[0-9]++");
    public int myAtoi(String str){
        //遍历
        int i = 0;
        int n = str.length();
        while (i < n && str.charAt(i) == ' '){
            i++;
        }
        if (i == n){
            return 0;
        }
        int flag = 1;
        if (str.charAt(i) == '+' || str.charAt(i) == '-'){
            if (str.charAt(i) == '-'){
                flag = -1;
            }
            i++;
        }
        int ans = 0;
        while (i < n && Character.isDigit(str.charAt(i))){
            int tmp = str.charAt(i) - '0';
            if (flag == 1 && (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && tmp > 7))){
                return Integer.MAX_VALUE;
            }
            if (flag == -1 && (ans > - (Integer.MIN_VALUE / 10) || (ans == -(Integer.MIN_VALUE / 10) && tmp > 8))){
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + tmp;
            i++;
        }
        return ans * flag;

        //正则
/*        String strTrim = str.trim();
        Matcher matcher = pattern.matcher(strTrim);
        if (matcher.lookingAt()){
            String strNum = strTrim.substring(0, matcher.end());

            try {
                return Integer.parseInt(strNum);
            } catch (NumberFormatException nfe){
                return strNum.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;*/
    }
}
