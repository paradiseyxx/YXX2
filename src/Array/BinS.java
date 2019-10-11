package Array;

import java.util.Arrays;

/**
 * Created by yxx on 2019/8/30.
 */
public class BinS {
    public static void main(String args[]){
        int arr[] = new int[]{4,25,10};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,11);
        System.out.println(index);
    }
}
