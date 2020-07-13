package DataStructure.Array;

/**
 * Created by yxx on 2020/5/26.
 *
 * ������ɾ�Ĳ�
 */
public class MyOrderArrar {
    private int[] arr;
    private int elements;

    public MyOrderArrar(){
        arr = new int[50];
    }

    public MyOrderArrar(int maxsize){
        arr = new int[maxsize];
    }

    //��������
    public void insert(int value){
        int i;
        for (i = 0; i < elements; i++){
            if (arr[i] > value){
                break;
            }
        }

        for (int j = elements; j > i; j--){
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        elements++;
    }

    //��ʾ����
    public void display(){
        for (int i = 0; i < elements; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //��ֵ��������
    public int search(int value){
        int i;
        for (i = 0; i < elements; i++){
            if (arr[i] == value){
                break;
            }
        }
        if (i == elements){
            return -1;
        }else {
            return i;
        }
    }

    //��������������
    public int searchindex(int index){
        if (index >=  elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            return arr[index];
        }
    }

    //ɾ������
    public void delete(int index){
        if (index >= elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            for (int i = index; i < elements; i++){
                arr[index] = arr[index + 1];
            }
            elements = elements - 1;
        }
    }

    //��������
    public void change(int index, int value){
        arr[index] = value;
    }

    //���ַ���������
    public int binarySearch(int value){
        int middle = 0;
        int left = 0;
        int right = elements;

        while (true){
            middle = (left + right) / 2;
            if (arr[middle] == value){
                return middle;
            }else if (left > right){
                return -1;
            }else {
                if (arr[middle] > value){
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }
        }
    }

}