package DataStructure.Sort;

/**
 * Created by yxx on 2020/5/26.
 *
 * Ã°ÅÝÅÅÐò
 */
public class BubbleSort {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    //½øÐÐ½»»»
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

}
