package String;

import java.util.Arrays;

//�ָ��ַ���
public class Division {
    public static void main(String args[]){
        String str = "192.168.0.1";
        //���ա�.�����зָʹ��ת���ַ���\\.��
        String[] firstArray = str.split("\\.");
        String[] secondArray = str.split("\\.",2);
        System.out.println("["+str+"]");
        System.out.print("ȫ���ָ�Ľ����");
        /*for (String a : firstArray){
            System.out.print("["+a+"]");
        }
        System.out.println();//����
        System.out.print("�ָ����εĽ����");
        for (String a : secondArray){
            System.out.print("["+a+"]");
        }
        System.out.println();//����*/
        System.out.println(Arrays.toString(firstArray));
        System.out.print("�ָ����εĽ����");
        System.out.println(Arrays.toString(secondArray));
    }
}
