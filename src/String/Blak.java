package String;

//去除空格
public class Blak {
    public static void main(String args[]){
        String str = "  hello world  ";
        System.out.println("字符串原来的长度："+str.length());
        String strim = str.trim();
        System.out.println("去除空格的字符串："+strim);
        System.out.println("去除空格的字符串长度："+strim.length());
    }
}
