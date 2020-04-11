package LC.easy;

/**
 * Created by YXX on 2020/3/21.
 *
 * 83. 删除排序链表中的重复元素
 */
public class DeleteDuplicates {
    public static void main(String args[]){
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(3);
        DeleteDuplicates dd = new DeleteDuplicates();
        ListNode listNode = dd.deleteDuplicates(l);
        if (listNode == null){
            System.out.println("");
        }else {
            ListNode currNode = listNode;
            while (currNode.next != null){
                System.out.println(currNode.val);
                currNode = currNode.next;
            }
        }
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode deleteDuplicates(ListNode head){
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
