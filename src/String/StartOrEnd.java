package String;

//�ж��ַ����Ŀ�ʼ���β
public class StartOrEnd {
    public static void main(String args[]){
        String str1 = "aabbccdd";
        String str2 = "bbaaddcc";
        boolean b1 = str1.startsWith("aa");
        boolean b2 = str1.endsWith("cc");
        boolean b3 = str2.startsWith("aa");
        boolean b4 = str2.endsWith("cc");
        System.out.println("�ַ���str1����'aa'��ʼ����"+b1);
        System.out.println("�ַ���srt1����'cc'��������"+b2);
        System.out.println("�ַ���str2����'aa'��ʼ����"+b3);
        System.out.println("�ַ���str2����'cc'��������"+b4);
    }
}
