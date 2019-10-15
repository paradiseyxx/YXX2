package LC.medium;

import java.util.Scanner;

/**
 * 2. 两数相加
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    Node head = null;

    public class Node{
        Node next = null;
        int value;

        public Node(int value){
            this.value = value;
        }
    }
    public void addnode(int value){
        Node newnode = new Node(value);
        if (head == null){
            head = newnode;
            return;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(carry % 10);
            curr = curr.next;
            if (p != null){
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(0);
        System.out.println("l1:");
        Scanner in1 = new Scanner(System.in);
        for (int i = 0;i < 3;i++){
            int t = in1.nextInt();
            l1.addnode(t);
        }
        System.out.println("l2:");
        Scanner in2 = new Scanner(System.in);
        for (int j = 0; j < 3;j++){
            int r = in2.nextInt();
            l2.addnode(r);
        }
        l3.addTwoNumbers(l1,l2);
    }

}
