package BS.PDD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by YXX on 2020/8/2.
 */
public class PDDThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);
        ArrayList<lunch> l = new ArrayList<>();
        ArrayList<dinner> d = new ArrayList<>();
        for (int i = 0; i < N; i++){
            String[] str = sc.nextLine().split(" ");
            l.add(new lunch(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
        }
        l.add(new lunch(0, 0));

        for (int i = 0; i < M; i++){
            String[] str = sc.nextLine().split(" ");
            d.add(new dinner(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
        }
        d.add(new dinner(0, 0));

        if (K == 0){
            System.out.println(0);
            return;
        }

        int cur, taste;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < l.size(); i++){
            lunch tmp1 = l.get(i);
            for (int j = 0; j < d.size(); j++){
                dinner tmp2 = d.get(j);
                taste = tmp1.t + tmp2.t;
                cur = tmp1.k + tmp2.k;
                if (taste >= K){
                    if (cur < sum){
                        sum = cur;
                    }
                }
            }
        }
        if (sum == Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }

    public static class lunch{
        public int k;
        public int t;

        public lunch(int k, int t){
            this.k = k;
            this.t = t;
        }
    }

    public static class dinner{
        public int k;
        public int t;

        public dinner(int k, int t){
            this.k = k;
            this.t = t;
        }
    }
}
