package LC.easy;

/**
 * Created by YXX on 2020/3/16.
 *
 * 38. 外观数列
 */
public class CountAndSay {
    public static void main(String args[]){
        CountAndSay cas = new CountAndSay();
        System.out.println(cas.countAndSay(3));

    }

    public String countAndSay(int n){
        String s = "1";
        if (n == 1){
            return s;
        }else {
            for (int i = 2; i <= n; i++){
                StringBuilder str = new StringBuilder();
                int count = 1;
                char pre = s.charAt(0);
                for (int j = 1; j < s.length(); j++){
                    if (s.charAt(j) == pre){
                        count++;
                    }else {
                        str.append(count).append(pre);
                        pre = s.charAt(j);
                        count = 1;
                    }
                }
                str.append(count).append(pre);
                s = str.toString();
            }
        }
        return s;
    }
}
