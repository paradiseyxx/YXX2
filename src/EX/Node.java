package EX;

/**
 * Created by Administrator on 2019/10/14.
 */
import java.util.Scanner;


public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void add(Node node) {
        this.next = node;
    }

    public boolean hasNext() {
        return this.next == null ? false : true;
    }

    public static void main(String[] args) {
        Node first = null; //��¼��һ���ڵ㣬�ں��������ʱ��ʹ��
        Node node = null; //���浱ǰ����Ľڵ�ʹ��

        Scanner in = new Scanner(System.in); //���ڿ���̨���룬Ctrk+Z��������
        while(in.hasNext()) {
            int v = in.nextInt();
            Node n = new Node(v);
            if(first == null) {
                first = n;
                node = n;
            } else {
                node.add(n);
                node = n;
            }
        }

        if(first == null) {
            System.out.println("û����������");
        } else {
            node = first;
            System.out.println(node.value + "");
            while(node.hasNext()) {
                node = node.next;
                System.out.println(node.value + " ");
            }
        }
    }
}
