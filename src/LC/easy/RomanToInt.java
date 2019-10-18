package LC.easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by yxx on 2019/10/17.
 *
 * 13. 罗马数字转整数
 */
public class RomanToInt {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("roman:");
        String roman = sc.nextLine();
        RomanToInt rti = new RomanToInt();
        System.out.println(rti.romanToInt(roman));
    }

    public int romanToInt(String s) {
        int ans = 0;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);

        for (int i = 0;i < s.length();i++){
            if (i + 1 < s.length() && map.containsKey(s.substring(i,i + 2))){
                ans = ans + map.get(s.substring(i,i + 2));
                i++;
            } else {
                ans = ans + map.get(s.substring(i,i + 1));
                //i++;
            }
        }
        return ans;
    }
}
