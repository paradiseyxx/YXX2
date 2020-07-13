package JZ;

import java.util.Scanner;

/**
 * Created by yxx on 2020/6/22.
 *
 * 二维数组中的查找
 */
public class JZOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        JZOne jzOne = new JZOne();
        System.out.println(jzOne.Find(target,array));
    }

    public boolean Find(int target, int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
