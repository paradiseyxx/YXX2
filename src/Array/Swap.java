package Array;

import java.util.Arrays;

//�������Ԫ��
public class Swap {
    public static void main(String args[]){
        int arr[] = new int[5];
        Arrays.fill(arr,8);
        System.out.println(Arrays.toString(arr));
        for (int i = 0;i < arr.length;i++){
            System.out.println("��"+i+"��Ԫ�ص�ֵΪ��"+arr[i]);
        }
    }
}
