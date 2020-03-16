package LC.easy;

import java.util.Scanner;

/**
 * Created by YXX on 2020/3/16.
 *
 * 28. й╣ож strStr()
 */
public class StrStr {
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("heyStack:");
        String heyStack = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("needle:");
        String needle = sc2.nextLine();
        StrStr str = new StrStr();
        System.out.println(str.strStr(heyStack,needle));
    }

    public int strStr(String heyStack,String needle){
        if (needle.equals("")){
            return 0;
        } else {
            int j = 0;
            for (int i = 0;i < heyStack.length();i++){
                if (heyStack.charAt(i) == needle.charAt(j) && heyStack.substring(i,heyStack.length()).length() >= needle.length()){
                    String heyStacksub = heyStack.substring(i,i + needle.length());
                    if (heyStacksub.equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
