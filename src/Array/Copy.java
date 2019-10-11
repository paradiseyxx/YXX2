package Array;

import java.util.Arrays;


public class Copy {
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3};
        int newarr1[] = Arrays.copyOf(arr,5);
        int newarr2[] = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(newarr1));
        System.out.println(Arrays.toString(newarr2));
    }
}
