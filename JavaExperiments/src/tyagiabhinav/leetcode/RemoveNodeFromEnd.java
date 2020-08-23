package tyagiabhinav.leetcode;

public class RemoveNodeFromEnd {

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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        int size = 0;
//        ListNode temp = head;
//        while (temp != null) {
//            temp = temp.next;
//            size++;
//        }
//
//        int counter = 1;
//        temp = new ListNode(0);
//        ListNode cur=temp;
//        while (head != null) {
//            if (counter++ == (size - n+1)) {
//                if(head.next != null) {
//                    cur.next = new ListNode(head.next.val);
//                    head = head.next.next;
//                }else{
//                    cur.next = null;
//                    head = head.next;
//                }
//
//            } else {
//                cur.next = new ListNode(head.val);
//                head = head.next;
//            }
//            cur = cur.next;
//        }
//        return temp.next;

        int size = 1;
        ListNode cur = head, temp = head;
        while (cur.next != null) {
            size++;
            cur = cur.next;
            if (size > n + 1)
                temp = temp.next;
        }
        if (size == n)
            return head.next;
        else {
            temp.next = temp.next.next;
            return head;
        }
    }

    public static void main(String[] args) {

        ListNode l2 = new ListNode(5);
        l2 = new ListNode(4, l2);
        l2 = new ListNode(3, l2);
        l2 = new ListNode(2, l2);
        l2 = new ListNode(1, l2);
//        l2 = new ListNode(9, l2);
//        l2 = new ListNode(9, l2);
//        l2 = new ListNode(9, l2);
//        l2 = new ListNode(9, l2);
//        l2 = new ListNode(1, l2);

//        while (l2 != null) {
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }

        ListNode l3 = removeNthFromEnd(l2, 2);

        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

}
