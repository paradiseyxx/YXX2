package BS.HW;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] ar = new double[n];

        for (int i = 0; i < n; i++){
            ar[i] = sc.nextDouble();
        }
        double sum = Arrays.stream(ar).sum();
        double mid1 = sum / 2;
        int maxw = (int)Math.ceil(mid1);
        double[] dp = new double[maxw + 1];

        for (int i = 0; i <= maxw; i++){
            dp[i] = ar[0] < i ? 0 : ar[0];
        }
        boolean flag = false;
        double sum1 = ar[0];
        for (int i = 1; i < n && !flag; i++){
            for (int j = maxw; j >= ar[i]; j--){
                int index = (int)(j - ar[i]);
                double tsum1 = dp[index] + ar[i];
                if (tsum1 == mid1){
                    flag = true;
                    break;
                }
                if (tsum1 < mid1 && tsum1 > dp[j]){
                    sum1 = tsum1;
                    dp[j] = tsum1;
                }
            }
        }

        if (sum1 > sum - sum1){
            System.out.printf("%.0f",sum1);
        } else {
            System.out.printf("%.0f",(sum - sum1));
        }
    }
}
