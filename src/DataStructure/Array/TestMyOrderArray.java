package DataStructure.Array;

/**
 * Created by yxx on 2020/5/26.
 *
 * ����MyArray
 */
public class TestMyOrderArray {
    public static void main(String args[]){
        MyOrderArrar arr = new MyOrderArrar();

        //��������
        arr.insert(3);
        arr.insert(9);
        arr.insert(1);
        arr.insert(6);
        arr.insert(10);

        //չʾ����
        arr.display();

        //���ַ���������
        System.out.println(arr.binarySearch(3));

        /*
        //��ֵ��������
        System.out.println(arr.search(5));

        //��������������
        System.out.println(arr.searchindex(1));

        //ɾ������
        arr.delete(1);
        arr.display();

        //��������
        arr.change(0,6);
        arr.display();
        */
    }
}
