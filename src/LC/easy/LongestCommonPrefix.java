package LC.easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by yxx on 2019/10/17.
 *
 * 14. 最长公共前缀
 */
public class LongestCommonPrefix {

    public static void main(String args[]){
        String[] strs = new String[3];
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("str1:");
        String str1 = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("str2:");
        String str2 = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("str3:");
        String str3 = sc3.nextLine();*/
        for (int i = 0;i < strs.length;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("strs:");
            String str = sc.nextLine();
            strs[i] = str;
        }
        /*for (int i = 0;i < strs.length;i++) {
            System.out.println(strs[i]);
        }*/
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0){
            return "";
        }
        for (int i = 0;i < strs[0].length();i++){
            char c = strs[0].charAt(i);
            for (int j = 1;j < strs.length;j++){
                if (strs[j].charAt(i) != c || i == strs.length){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
