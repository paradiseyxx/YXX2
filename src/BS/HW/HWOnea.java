package BS.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWOnea {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            int page = Integer.parseInt(str[0]);
            int[] time = new int[page];
            int sec = 0;

            for (int j = 0; j < page; j++){
                time[j] = Integer.parseInt(str[j + 1]);
                sec += time[j];
                time[j] = (sec / 60) + 1;
            }
            boolean flag = true;
            for (int j = page - 1; j >= 3; j--){
                if (time[j] - time[j - 3] < 1){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
