package LC.easy;

import java.util.Scanner;

/**
 * Created by yxx on 2020/5/22.
 *
 * 125. 验证回文串
 */
public class IsPalindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        IsPalindromeString ips = new IsPalindromeString();
        System.out.println(ips.isPalindrome(s));
    }

    public boolean isPalindrome(String s){
        char[] array = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            while (!Character.isLetterOrDigit(array[i]) && i < j){
                i++;
            }
            while (!Character.isLetterOrDigit(array[j]) && i < j){
                j--;
            }
            if ((int)Character.toLowerCase(array[i]) != (int)Character.toLowerCase(array[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
