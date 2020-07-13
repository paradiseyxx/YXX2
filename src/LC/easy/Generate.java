package LC.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yxx on 2020/5/17.
 *
 * 118. Ñî»ÔÈý½Ç
 */
public class Generate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        Generate generate = new Generate();
        System.out.println(generate.generate(rows));
    }

    public List<List<Integer>> generate(int numsRows){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numsRows == 0){
            return triangle;
        }else {
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);

            for (int i = 1; i < numsRows; i++){
                List<Integer> row = new ArrayList<>();
                List<Integer> prerow = triangle.get(i - 1);
                row.add(1);
                for (int j = 1; j < i; j++){
                    row.add(prerow.get(j - 1) + prerow.get(j));
                }
                row.add(1);
                triangle.add(row);
            }
            return triangle;
        }

    }

}
