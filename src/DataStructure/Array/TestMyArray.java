package DataStructure.Array;

/**
 * Created by yxx on 2020/5/26.
 *
 * ����MyArray
 */
public class TestMyArray {
    public static void main(String args[]){
        MyArrar arr = new MyArrar();

        //��������
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);

        //չʾ����
        arr.display();

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
    }
}
