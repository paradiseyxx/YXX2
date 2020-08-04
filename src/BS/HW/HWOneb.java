package BS.HW;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWOneb {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            int numPage = sc.nextInt();
            int cur = 0;
            int[] time = new int[numPage];
            for (int j = 0; j < numPage; j++){
                cur += sc.nextInt();
                time[j] = cur;
            }
            int ans = 1;
            int min = 0;
            int max = 60;
            int a = 0;
            for (int j = 0; j < numPage; j++){
                if (time[j] > min && time[j] <= max){
                    a += 1;
                    if (a > 4){
                        ans = 0;
                        break;
                    }
                } else {
                    min += 60;
                    max += 60;
                    a = 1;
                }
            }
            System.out.println(ans);
        }
    }
}
