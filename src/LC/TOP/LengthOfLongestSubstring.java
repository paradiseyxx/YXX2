package LC.TOP;

import java.util.*;

/**
 * Created by YXX on 2020/7/17.
 *
 * 3. 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LengthOfLongestSubstring los = new LengthOfLongestSubstring();
        System.out.print(los.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s){
        //hashmap
//        int n = s.length();
//        int ans = 0;
//        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
//
//        for (int start = 0, end = 0; end < n; end++){
//            char c = s.charAt(end);
//            if (map.containsKey(c)){
//                start = Math.max(start , map.get(c));
//            }
//            ans = Math.max(ans , end - start + 1);
//            map.put(c , end + 1);
//        }
//        return ans;

        //queue
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (char c : s.toCharArray()){
            while (queue.contains(c)){
                queue.poll();
            }
            queue.add(c);
            res = Math.max(res , queue.size());
        }
        return res;
    }
}
