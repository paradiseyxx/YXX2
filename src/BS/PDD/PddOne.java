package BS.PDD;

import java.util.Scanner;

/**
 * Created by YXX on 2020/8/2.
 */
public class PddOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = sc.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        PddOne pddOne = new PddOne();
        System.out.println(pddOne.pddOne(length, count, nums));
    }

    public String pddOne(int length, int count, int[] nums){
        String res = "paradox";
        if (length == 0){
            return res;
        }

        int[] ans = new int[2];
        StringBuilder sb = new StringBuilder();
        int back = 0;
        for (int i = 0; i < nums.length; i++){
            int num1 = length - nums[i];
            if (num1 == 0 && i < nums.length - 1){
                return res;
            }
            if (num1 == 0){
                ans[0] = 0;
                ans[1] = back;
                sb.append(ans[0]);
                sb.append(" ");
                sb.append(ans[1]);
                return sb.toString();
            }
            if (num1 > 0){
                length = num1;
                ans[0] = length;
            }else if (num1 < 0){
                back++;
                ans[1] = back;
                length = Math.abs(num1);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ans[0]);
        sb2.append(" ");
        sb2.append(ans[1]);
        return sb2.toString();
    }
}
