package LC.TOP;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/19.
 *
 * 5. 最长回文子串
 */
public class LongestPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LongestPalindrome lp = new LongestPalindrome();
        System.out.print(lp.longestPalindrome(s));
    }

    //暴力
/*    public String longestPalindrome(String s){
        if (s.length() <= 1){
            return s;
        }
        char[] charArray = s.toCharArray();
        int maxLen = 1;
        int begin = 0;
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = 0; j < s.length(); j++){
                if ((j - i + 1) > maxLen && validPalindrome(charArray, i, j)){
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        String res = s.substring(begin, begin + maxLen);
        return res;
    }

    public boolean validPalindrome(char[] charArray, int left, int right){
        while (left < right){
            if (charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/

    //动态规划
    public String longestPalindrome(String s){
        if (s.length() <= 1){
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        char[] charArray = s.toCharArray();

        int begin = 0;
        int maxLen = 1;

        //dp[0][0] = true;

        for (int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }

        for (int j = 1; j < s.length(); j++){
            for (int i = 0; i < s.length() - 1; i++){
                if (charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                    if (j - i < 3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && j - i + 1 > maxLen){
                    begin = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
