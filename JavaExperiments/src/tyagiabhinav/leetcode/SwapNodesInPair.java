package tyagiabhinav.leetcode;

public class SwapNodesInPair {

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

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        if (head.next != null) {
            ListNode p1 = head, p2 = head.next;
            int counter = 0;
            while (p1.next != null && p2 != null) {
                if (p2.next == null) {
                    ListNode temp = p2;
                    p1.next = temp;
                } else {
                    ListNode temp = p2.next;
                    p1.next = temp;
                }
                p2.next = p1;
                if (counter++ == 0) {
                    head = p2;
                    dummy.next = head;
                } else {
                    head.next = p2;
                }
                head = p2.next;
                p1 = p1.next;
                if (p1.next != null) p2 = p1.next;
            }

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = new ListNode(3, l1);
        l1 = new ListNode(2, l1);
        l1 = new ListNode(1, l1);

//            ListNode l2 = null;//new ListNode(5);
//        l2 = new ListNode(4, l2);
//        l2 = new ListNode(3, l2);
//        l2 = new ListNode(1, l2);

        ListNode l3 = swapPairs(l1);

        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }
}
