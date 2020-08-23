package tyagiabhinav.leetcode;

import java.util.Stack;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode a=l1, b=l2, cur=temp;
        int carry = 0;
        while(a!=null || b!=null){
            int x = (a != null)? a.val : 0;
            int y = (b != null)? b.val : 0;
            int sum = x+y+carry;
            carry = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(a != null){
                a = a.next;
            }
            if(b != null){
                b = b.next;
            }
        }
        if(carry>0){
            cur.next = new ListNode(carry);
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
//        l1 = new ListNode(4, l1);
//        l1 = new ListNode(2, l1);

        ListNode l2 = new ListNode(9);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(1, l2);

        ListNode l3 = addTwoNumbers(l1, l2);

        while(l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
//
//        while(l2 != null){
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }


    }


}
