package DataStructure.Listnode;

/**
 * Created by yxx on 2020/7/14.
 *
 * 链表
 */
public class Linklist {
    //头结点
    private Node first;

    public Linklist(){
        first = null;

    }

    //插入一个节点，从头结点后插入
    public void insert(int val){
        Node node = new Node(val);
        node.next = first;
        first = node;
    }

    //删除一个节点，从头结点后删除
    public Node delete(){
        Node tmp = first;
        first = tmp.next;
        return tmp;
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
}
