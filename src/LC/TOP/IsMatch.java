package LC.TOP;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/21.
 *
 * 10. 正则表达式匹配
 */
public class IsMatch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        IsMatch isMatch = new IsMatch();
        System.out.print(isMatch.isMatch(s1, s2));
    }

    public boolean isMatch(String s, String p){
        //回溯
/*        if (p.isEmpty()){
            return s.isEmpty();
        }

        boolean headMatched = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*'){
            return isMatch(s, p.substring(2)) || (headMatched && isMatch(s.substring(1), p));
        }else if (headMatched){
            return isMatch(s.substring(1), p.substring(1));
        }else {
            return false;
        }*/

        //dp
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

        dp[0][0] = true;

        for (int k = 2; k <= p.length(); k++){
            dp[0][k] = p.charAt(k - 1) == '*' && dp[0][k - 2];
        }

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < p.length(); j++){
                if (p.charAt(j) == '*'){
                    dp[i + 1][j + 1] = dp[i + 1][j - 1] || (dp[i][j + 1] && headMatched(s, p, i, j - 1));
                }else {
                    dp[i + 1][j + 1] = dp[i][j] && headMatched(s, p, i, j);
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public boolean headMatched(String s, String p, int i, int j){
        return s.charAt(i) == p.charAt(j) || p.charAt(j) == '.';
    }
}
