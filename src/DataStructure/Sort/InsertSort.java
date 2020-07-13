package DataStructure.Sort;

/**
 * Created by yxx on 2020/5/26.
 *
 * ≤Â»Î≈≈–Ú
 */
public class InsertSort {

    public static void sort(int[] arr){
        int preIndex,current;
        for (int i = 1; i < arr.length; i++){
            current = arr[i];
            preIndex = i - 1;
            while (preIndex >= 0 && arr[preIndex] > current){
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;  
        }
    }
}
