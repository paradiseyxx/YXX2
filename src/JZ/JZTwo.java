package JZ;

import java.util.Scanner;

/**
 * Created by yxx on 2020/7/13.
 *
 * Ìæ»»¿Õ¸ñ
 */
public class JZTwo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        sb.append(sc.nextLine());
        JZTwo jzTwo = new JZTwo();
        System.out.println(jzTwo.replaceSpace(sb));
    }

    public String replaceSpace(StringBuffer str){
        StringBuffer newstr = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                newstr.append("%20");
            } else {
                newstr.append(str.charAt(i));
            }
        }
        return newstr.toString();
    }
}
