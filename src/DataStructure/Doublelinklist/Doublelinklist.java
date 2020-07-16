package DataStructure.Doublelinklist;

/**
 * Created by yxx on 2020/7/15.
 *
 * 双向链表
 */
public class Doublelinklist {
    //头结点
    private Node first;
    //尾结点
    private Node last;

    public Doublelinklist(){
        first = null;
        last = null;
    }

    //插入一个节点，从头结点后插入
    public void insert(int val){
        Node node = new Node(val);
        if (isEmpty()){
            last = node;
        }else {
            first.prev = node;
        }
        node.next = first;
        first = node;
    }

    //尾部插入
    public void insertLast(int val){
        Node node = new Node(val);
        if (isEmpty()){
            first = node;
        }else {
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    //删除一个节点，从头结点后删除
    public Node delete(){
        Node tmp = first;
        if (first.next == null){
            last = null;
        }else {
            first.next.prev = null;
        }
        first = tmp.next;
        return tmp;
    }

    //删除，尾部
    public Node deleteLast(){
        Node tmp = last;
        if (first.next == null){
            last = null;
        }else {
            last.prev.next = null;
            last = last.prev;
        }

        return last;
    }

    //显示
    public void display(){
        Node current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    //查找
    public Node find(int val){
        Node current = first;
        while (current.data != val){
            if (current.next == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }

    //删除
    public Node deleteval(int val){
        Node current = first;
        Node prev = first;
        while (current.data != val){
            if (current.next == null){
                return null;
            }
            prev = current;
            current = current.next;
        }
        if (current == first){
            first = first.next;
        }else {
            prev.next = current.next;
        }
        return current;
    }

    //判断是否为空
    public boolean isEmpty(){
        return (first == null);
    }
}
