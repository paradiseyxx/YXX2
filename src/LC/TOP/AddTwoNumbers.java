package LC.TOP;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by YXX on 2020/7/16.
 *
 * 2. 两数相加
 */
public class AddTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ListNode head1 = new ListNode(sc.nextInt());
        head1.addNode(head1,sc.nextInt());
        head1.addNode(head1,sc.nextInt());

        ListNode head2 = new ListNode(sc.nextInt());
        head2.addNode(head2,sc.nextInt());
        head2.addNode(head2,sc.nextInt());

//        head1.display(head1);
//        head2.display(head2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode cur = addTwoNumbers.addTwoNumbers(head1,head2);

        ArrayList<Integer> list = addTwoNumbers.printListReverse(cur);
        for (Integer integer : list){
            System.out.print(integer + " ");
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;

        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if ( l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry == 1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public ArrayList<Integer> printListReverse(ListNode listNode){
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }

    public void addNode(ListNode head,int val){
        ListNode node = new ListNode(val);
        ListNode tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = node;
    }

//    public void display(ListNode head){
//        ListNode tmp = head;
//        while (tmp != null){
//            System.out.print(tmp.val + " ");
//            tmp = tmp.next;
//        }
//    }

}
