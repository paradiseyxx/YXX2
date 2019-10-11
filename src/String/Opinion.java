package String;

//ÅÐ¶Ï×Ö·û´®ÊÇ·ñÏàµÈ
public class Opinion {
    public static void main(String args[]){
        String s1 = new String("abc");
        String s2 = new String("ABC");
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println(s1+"equals"+s2+":"+b1);
        System.out.println(s1+"equalsIngoreCase"+s2+":"+b2);
    }
}
