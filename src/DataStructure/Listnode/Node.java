package DataStructure.Listnode;

/**
 * Created by yxx on 2020/5/29.
 *
 * 链结点
 */
public class Node {
    //数据域
    public int data;
    //指针域
    public Node next;

    public Node(int val){
        this.data = val;
    }

    //显示
    public void display(){
        System.out.print(data + " ");
    }
}
