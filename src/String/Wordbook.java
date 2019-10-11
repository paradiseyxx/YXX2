package String;

//按字典顺序比较两个字符串
public class Wordbook {
    public static void main(String args[]){
        String str1 = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        System.out.println(str1+"compareTo"+str2+":"+str1.compareTo(str2));
        System.out.println(str1+"compareTo"+str3+":"+str1.compareTo(str3));
    }
}
