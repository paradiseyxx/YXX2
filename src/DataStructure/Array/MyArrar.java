package DataStructure.Array;

/**
 * Created by yxx on 2020/5/26.
 *
 * 数组增删改查
 */
public class MyArrar {
    private int[] arr;
    private int elements;

    public MyArrar(){
        arr = new int[50];
    }

    public MyArrar(int maxsize){
        arr = new int[maxsize];
    }

    //增加数据
    public void insert(int value){
        arr[elements] = value;
        elements++;
    }

    //显示数据
    public void display(){
        for (int i = 0; i < elements; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //按值查找数据
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

    //按索引查找数据
    public int searchindex(int index){
        if (index >=  elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            return arr[index];
        }
    }

    //删除数据
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

    //更新数据
    public void change(int index, int value){
        arr[index] = value;
    }

}
