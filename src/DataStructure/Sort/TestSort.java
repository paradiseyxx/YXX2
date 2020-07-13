package DataStructure.Sort;

/**
 * Created by yxx on 2020/5/26.
 *
 * ≈≈–Ú≤‚ ‘¿‡
 */
public class TestSort {
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = 1;
        arr[3] = 6;
        arr[4] = 10;


        //√∞≈›≈≈–Ú
        BubbleSort.sort(arr);

        //—°‘Ò≈≈–Ú
        SelectSort.sort(arr);

        //≤Â»Î≈≈–Ú
        InsertSort.sort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
