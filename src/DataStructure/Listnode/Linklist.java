package DataStructure.Listnode;

/**
 * Created by yxx on 2020/7/14.
 *
 * ����
 */
public class Linklist {
    //ͷ���
    private Node first;

    public Linklist(){
        first = null;

    }

    //����һ���ڵ㣬��ͷ�������
    public void insert(int val){
        Node node = new Node(val);
        node.next = first;
        first = node;
    }

    //ɾ��һ���ڵ㣬��ͷ����ɾ��
    public Node delete(){
        Node tmp = first;
        first = tmp.next;
        return tmp;
    }

    //��ʾ
    public void display(){
        Node current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    //����
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

    //ɾ��
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
