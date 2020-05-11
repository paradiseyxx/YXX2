package BS.ZH;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by YXX on 2020/4/29.
 */
public class Main1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int pairNum = scanner.nextInt();
        int[] originRow = new int[pairNum * 2];
        HashMap<Integer,Integer> num2pos = new HashMap<>();
        for (int j = 0; j < pairNum * 2; j++){
            originRow[j] = scanner.nextInt();
            num2pos.put(originRow[j],j);
        }

        int res = 0;
        for (int i = 0; i < originRow.length; i+= 2){
            int husband = originRow[i];
            int wife = husband ^ 1;
            if (originRow[i + 1] == wife){
                continue;
            }
            int wifepos = num2pos.get(wife);
            originRow[wifepos] = originRow[i + 1];
            originRow[i + 1] = wife;
            res++;
        }
        System.out.print(res);

    }


}
