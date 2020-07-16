package DataStructure.Doublelinklist;

/**
 * Created by yxx on 2020/7/15.
 *
 * ˫������
 */
public class Doublelinklist {
    //ͷ���
    private Node first;
    //β���
    private Node last;

    public Doublelinklist(){
        first = null;
        last = null;
    }

    //����һ���ڵ㣬��ͷ�������
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

    //β������
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

    //ɾ��һ���ڵ㣬��ͷ����ɾ��
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

    //ɾ����β��
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

    //�ж��Ƿ�Ϊ��
    public boolean isEmpty(){
        return (first == null);
    }
}
