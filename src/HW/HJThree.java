package HW;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by yxx on 2020/6/27.
 *
 * 明明的随机数
 */
public class HJThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        while (!sc.nextLine().equals("")){
            int num = sc.nextInt();
            for (int i = 0; i < num; i++){
                treeSet.add(sc.nextInt());
            }
        }
        for (Integer integer : treeSet){
            System.out.println(integer);
        }
    }
}
