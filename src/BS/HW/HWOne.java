package BS.HW;

import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nums; i++){
            String input = sc.nextLine();
            String[] splitInput = input.split(" ");
            int[] secondPerPage = new int[splitInput.length - 1];
            for (int i1 = 1; i1 < splitInput.length; i1++){
                secondPerPage[i1 - 1] = Integer.parseInt(splitInput[i1]);
            }

            int minute = 0;
            int secondSum = 0;
            int pagesPerMinute = 0;
            for (Integer dur: secondPerPage){
                secondSum += dur;
                int nowMin = secondSum / 60;
                if (nowMin != minute){
                    minute = nowMin;
                    if (pagesPerMinute > 4){
                        break;
                    }else {
                        pagesPerMinute = 1;
                    }
                }else {
                    pagesPerMinute += 1;
                }
            }
            if (pagesPerMinute > 4){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        }
/*        int num = sc.nextInt();
        while (sc.hasNext()){
            int pageNum = sc.nextInt();
            int[] time = new int[pageNum];
            for (int i = 0; i < pageNum; i++){
                time[i] = sc.nextInt();
            }
            System.out.println(getRes(time));
        }*/
    }

/*    public static int getRes(int[] time){
        int n = time.length;
        if (n <= 4){
            return 1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++){
            while (sum < 60)
        }
    }*/
}
