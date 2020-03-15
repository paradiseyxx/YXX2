package LC.easy;

/**
 * Created by YXX on 2020/3/14.
 *
 * 21. �ϲ�������������
 */
public class MergeTwoLists {
    public static void main(String args[]){

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        MergeTwoLists mtl = new MergeTwoLists();
        ListNode listNode = mtl.mergeTwoLists(l1,l2);
        if (listNode == null){
            System.out.println("error");
        }else {
            ListNode currNode = listNode;
            while (currNode !=null){
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        //�ݹ�
        /*if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else {
            if (l1.val < l2.val){
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }else {
                l2.next = mergeTwoLists(l1,l2.next);
                return l2;
            }
        }*/

        //����
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
