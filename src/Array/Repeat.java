package Array;

import java.util.Arrays;

//¸´ÖÆÊý×é
public class Repeat {
    public static void main(String args[]){
        int arr[] = new int[]{1,2,4,5};
        int newarr1[] = Arrays.copyOfRange(arr,0,2);
        int newarr2[] = Arrays.copyOfRange(arr,0,6);
        System.out.println(Arrays.toString(newarr1));
        System.out.println(Arrays.toString(newarr2));
    }
}
