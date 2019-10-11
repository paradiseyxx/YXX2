package String;

//判断字符串的开始与结尾
public class StartOrEnd {
    public static void main(String args[]){
        String str1 = "aabbccdd";
        String str2 = "bbaaddcc";
        boolean b1 = str1.startsWith("aa");
        boolean b2 = str1.endsWith("cc");
        boolean b3 = str2.startsWith("aa");
        boolean b4 = str2.endsWith("cc");
        System.out.println("字符串str1是以'aa'开始的吗？"+b1);
        System.out.println("字符串srt1是以'cc'结束的吗？"+b2);
        System.out.println("字符串str2是以'aa'开始的吗？"+b3);
        System.out.println("字符串str2是以'cc'结束的吗？"+b4);
    }
}
