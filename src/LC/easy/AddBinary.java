package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/17.
 *
 * 67. 二进制求和
 */
public class AddBinary {
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("str1:");
        String str1 = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("str2:");
        String str2 = sc2.nextLine();
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary(str1,str2));
    }

    public String addBinary(String a, String b){
        //return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b, 2));



        /*StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        if (a.length() == b.length()){
            c.append(a);
            d.append(b);
        }else {
            String s1 = a.length() > b.length() ? b : a;
            String s2 = a.length() > b.length() ? a : b;
            for (int i = 0; i < s2.length() - s1.length(); i++){
                c.append(0);
            }
            c.append(s1);
            d.append(s2);
        }
        StringBuilder sb = new StringBuilder();
        String str1 = c.toString();
        String str2 = d.toString();
        String[] c1 = str1.split("");
        int[] intc1 = new int[c1.length];
        for (int i = 0; i < intc1.length; i++){
            intc1[i] = Integer.parseInt(c1[i]);
        }
        String[] d1 = str2.split("");
        int[] intd1 = new int[d1.length];
        for (int i = 0; i < intd1.length; i++){
            intd1[i] = Integer.parseInt(d1[i]);
        }
        int e = 0;
        for (int j = c.length() - 1; j >= 0; j--){
            if (intc1[j] + intd1[j] + e < 2){
                sb.append(intc1[j] + intd1[j] + e);
            }else if (intc1[j] + intd1[j] + e == 2){
                sb.append(0);
                e = 1;
            }else if (intc1[j] + intd1[j] + e == 3){
                sb.append(1);
                e = 1;
            }
        }
        StringBuilder sb1 = new StringBuilder();
        for (int k = sb.length() - 1; k >= 0; k--){
            sb1.append(sb.charAt(k));
        }
        String str = sb1.toString();
        return str;*/
        return null;
    }
}
