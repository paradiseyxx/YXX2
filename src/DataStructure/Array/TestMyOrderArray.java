package DataStructure.Array;

/**
 * Created by yxx on 2020/5/26.
 *
 * 测试MyArray
 */
public class TestMyOrderArray {
    public static void main(String args[]){
        MyOrderArrar arr = new MyOrderArrar();

        //插入数据
        arr.insert(3);
        arr.insert(9);
        arr.insert(1);
        arr.insert(6);
        arr.insert(10);

        //展示数据
        arr.display();

        //二分法查找数据
        System.out.println(arr.binarySearch(3));

        /*
        //按值查找数据
        System.out.println(arr.search(5));

        //按索引查找数据
        System.out.println(arr.searchindex(1));

        //删除数据
        arr.delete(1);
        arr.display();

        //更新数据
        arr.change(0,6);
        arr.display();
        */
    }
}
