package DataStructure.Doublelinklist;

/**
 * Created by yxx on 2020/5/29.
 *
 * �����
 */
public class Node {
    //������
    public int data;
    //ָ����
    public Node next;

    public Node prev;

    public Node(int val){
        this.data = val;
    }

    //��ʾ
    public void display(){
        System.out.print(data + " ");
    }
}
