package Array;

import java.util.Arrays;

//�����ѯ
public class Reference {
    public static void main(String args[]){
        int arr[] = new int[]{1,8,9,4,5};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,8);
        System.out.println(index);
    }
}
