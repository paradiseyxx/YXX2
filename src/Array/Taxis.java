package Array;

import java.util.Arrays;

//Êı×éÅÅĞò
public class Taxis {
    public static void main(String args[]){
        int arr[] = new int[]{3,5,1,4,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
