package Array;

import java.util.Arrays;

//����滻����Ԫ��
public class Displace {
    public static void main(String args[]){
        int arr[] = new  int[]{1,2,3,4,5};
        Arrays.fill(arr,1,5,6);
        System.out.println(Arrays.toString(arr));
    }
}
