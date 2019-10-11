package Array;

import java.util.Arrays;

//Ìî³äÌæ»»Êı×éÔªËØ
public class Displace {
    public static void main(String args[]){
        int arr[] = new  int[]{1,2,3,4,5};
        Arrays.fill(arr,1,5,6);
        System.out.println(Arrays.toString(arr));
    }
}
