package LC.easy;

import java.util.HashSet;

/**
 * Created by yxx on 2020/5/24.
 *
 * 141. 环形链表
 */
public class HasCycle {
    public static void main(String args[]){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(1);
        HasCycle hasCycle = new HasCycle();
        System.out.println(hasCycle.hasCycle(listNode));
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head){
        //hashset
        /*
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null){
            if (hashSet.contains(head)){
                return true;
            }else {
                hashSet.add(head);
            }
            head = head.next;
        }
        return false;
        */

        //双指针
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
