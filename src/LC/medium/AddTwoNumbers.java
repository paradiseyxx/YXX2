package LC.medium;

import java.util.Scanner;

/**
 * 2. 两数相加
 */
public class AddTwoNumbers {

    public int value;
    public AddTwoNumbers next;

    public boolean hasNext(){
        return this.next == null ? false : true;
    }

    public AddTwoNumbers(int value){
        this.value = value;
        this.next = null;
    }

    public void add(AddTwoNumbers node){
        this.next = node;
    }

    public static void main(String args[]){
        AddTwoNumbers first = null;
        AddTwoNumbers node = null;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int v = in.nextInt();
            AddTwoNumbers n = new AddTwoNumbers(v);
            if (first == null){
                first = n;
                node = n;
            }else {
                node.add(n);
            }
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

    return addTwoNumbers(l1, l2);
    }

}
