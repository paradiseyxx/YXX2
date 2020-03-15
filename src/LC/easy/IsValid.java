package LC.easy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by YXX on 2020/3/14.
 *
 * 20.ÓÐÐ§µÄÀ¨ºÅ
 */
public class IsValid {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("str:");
        String str = sc.nextLine();
        IsValid isv = new IsValid();
        System.out.println(isv.isValid(str));
    }

    public boolean isValid(String s){
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (map.containsKey(c)){
                char topelement = stack.empty() ? '#': stack.pop();
                if (topelement != map.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
