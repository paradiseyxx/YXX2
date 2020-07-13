package DataStructure.Sort;

/**
 * Created by yxx on 2020/5/26.
 *
 * —°‘Ò≈≈–Ú
 */
public class SelectSort {

    public static void sort(int[] arr){
        int minIndex, tmp;
        for (int i = 0; i < arr.length - 1; i++){
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }
}
