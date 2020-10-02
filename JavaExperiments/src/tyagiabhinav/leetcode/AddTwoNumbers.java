package tyagiabhinav.leetcode;

import java.util.*;

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

    private static ListNode getMid(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }

    private static ListNode getReverse(ListNode head){
        if(head == null) return null;
        ListNode tail = null;
        while(head.next != null){
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
        head.next = tail;
        return head;
    }

    private static ListNode sort(ListNode head){
        if(head == null) return head;
        List<ListNode> list = new ArrayList<>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        Collections.sort(list, (n1,n2) -> {
            return n2.val - n1.val;
        });
        ListNode node = null;
        ListNode prev = null;
        for(int i=0; i<list.size(); i++){
            node = new ListNode(list.get(i).val);
            node.next = prev;
            prev = node;
        }

        return node;
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

//        ListNode l3 = addTwoNumbers(l1, l2);


        ListNode l = new ListNode(5);
        l = new ListNode(4, l);
        l = new ListNode(3, l);
        l = new ListNode(2, l);
        l = new ListNode(1, l);
        ListNode l3 = getReverse(l);

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
