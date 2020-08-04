package BS.HW;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by YXX on 2020/7/22.
 */
public class HWTwoa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s;
        while (true){
            s = sc.nextLine();
            if (s == ""){
                break;
            }
            int i = 0;
            boolean match = true;
            while (i < s.length()){
                if (s.charAt(i) == '('){
                    match = rule2(s, i);
                    i++;
                }else if (s.charAt(i) == '['){
                    match = rule3(s,i);
                    i++;
                }
            }
        }
    }

    public static Boolean rule2(String s, int i){
        LinkedList<Integer> index = new LinkedList<>();
        index.add(i);
        while (i < s.length() && s.charAt(i) != ')'){
            if (s.charAt(i) == '|'){
                index.add(i);
            }
            i++;
        }
        if (i == s.length()){
            return false;
        }
        index.add(i);
        for (int j = 1; (j + 1) < index.size(); j++){
            int middle = index.get(j);
            int begin = index.get(j - 1) + 1;
            int end = index.get(j + 1) - 1;
            Boolean left = false;
            Boolean right = false;
            while (begin < middle){
                if (s.charAt(begin) != ' '){
                    left = true;
                    break;
                }
                begin++;
            }
            while (end > middle){
                if (s.charAt(end) != ' '){
                    right = true;
                    break;
                }
                end--;
            }
            if (left && right){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static Boolean rule3(String s, int i){
        LinkedList<Integer> index = new LinkedList<>();
        index.add(i);
        while (i < s.length() && s.charAt(i) != ']'){
            if (s.charAt(i) == '|'){
                index.add(i);
            }
            i++;
        }
        if (i == s.length()){
            return false;
        }
        index.add(i);
        for (int j = 1; (j + 1) < index.size(); j++){
            int middle = index.get(j);
            int begin = index.get(j - 1) + 1;
            int end = index.get(j + 1) - 1;
            Boolean left = false;
            Boolean right = false;
            while (begin < middle){
                if (s.charAt(begin) != ' '){
                    left = true;
                    break;
                }
                begin++;
            }
            while (end > middle){
                if (s.charAt(end) != ' '){
                    right = true;
                    break;
                }
                end--;
            }
            if (left && right){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static Boolean rule4(String s, int i){
        LinkedList<Integer> nums = new LinkedList<>();
        int num = 0;
        while (i < s.length() && s.charAt(i) != '}'){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = num * 10 + s.charAt(i) - '0';
            }else if (s.charAt(i) == ','){
                nums.add(num);
                num = 0;
            }
            i++;
        }
        nums.add(num);
        if (nums.size() != 2 || nums.get(0) > nums.get(1)){
            return false;
        }
        return true;
    }
}
