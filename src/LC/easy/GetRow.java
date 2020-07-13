package LC.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yxx on 2020/5/19.
 *
 * 119. 杨辉三角 II
 */
public class GetRow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rowIndex = sc.nextInt();
        GetRow getRow = new GetRow();
        System.out.println(getRow.getRow(rowIndex));
    }

    public List<Integer> getRow(int rowIndex){
        //方法一
        /*
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++){
            row.add(1);
            for (int j = i - 1; j > 0; j--){
                row.set(j, row.get(j - 1) + row.get(j));
            }
        }
        return row;
        */

        //方法二
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i < dp.length; i++){
            for (int j = i - 1; j > 0; j--){
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        List<Integer> row = Arrays.asList(dp);
        return row;
    }

}
