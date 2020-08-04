package BS.GLD;

import java.util.*;

/**
 * Created by YXX on 2020/7/22.
 */
public class GLDOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] length = new int[n];
        for (int i = 0; i < n; i++){
            length[i] = sc.nextInt();
        }
        GLDOne gldOne = new GLDOne();
        System.out.print(gldOne.getArea(length));
    }

    public int getArea(int[] length){
/*        ArrayList<Integer> list = new ArrayList<>();
        int n = length.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (length[i] == length[j]){
                    list.add(length[i]);
                    break;
                }
            }
        }
        if (list.size() == 0 || list.size() == 1 ){
            return -1;
        }

        Collections.sort(list);

        if (list.size() == 3){
            int num1 = list.get(list.size() - 1);
            int num2 = list.get(list.size() - 2);
            int num3 = list.get(list.size() - 3);

            if ( num1 == num2 && num2 == num3){
                return -1;
            }else if (num1 == num2){
                return num1 * num3;
            }else {
                return num1 * num2;
            }
        }
        return (list.get(list.size() - 1) * list.get(list.size() - 2));*/

        Arrays.sort(length);

        int[] dp = new int[length.length];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++){
            if (length[i] != length [i - 1]){
                dp[i] = 0;
            }else if (dp[i - 1] == 0){
                dp[i] = length[i];
            }else {
                dp[i] = 0;
            }
        }

        Arrays.sort(dp);
        int num1 = dp[dp.length - 1];
        int num2 = dp[dp.length - 2];

        if (num1 == 0 || num2 == 0){
            return -1;
        }else {
            return num1 * num2;
        }
    }
}
