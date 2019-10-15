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
        Node first = null; //记录第一个节点，在后面遍历的时候使用
        Node node = null; //保存当前输入的节点使用

        Scanner in = new Scanner(System.in); //用于控制台输入，Ctrk+Z结束输入
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
            System.out.println("没有数字输入");
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
