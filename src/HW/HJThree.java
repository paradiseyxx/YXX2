package HW;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by yxx on 2020/6/27.
 *
 * �����������
 */
public class HJThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            TreeSet<Integer> treeSet = new TreeSet<>();
            int num = sc.nextInt();
            if (num > 0){
                for (int i = 0; i < num; i++){
                    treeSet.add(sc.nextInt());
                }
            }
            for (Integer integer : treeSet){
                System.out.println(integer);
            }
        }

    }
}
