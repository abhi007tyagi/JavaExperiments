package tyagiabhinav.leetcode;

public class MergeTwoSortedLinkedList {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) return l2;
        if(l2 == null && l1 != null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode p1 = l1, curr = dummy, p2 = l2;
        while (p1 != null && p2 != null) {
            if(p1.val >= p2.val){
                curr.next = p2;
                p2 = p2.next;
            } else{
                curr.next = p1;
                p1 = p1.next;
            }
            curr = curr.next;
            if(p1 == null && p2 != null) curr.next = p2;
            if(p2 == null && p1 != null) curr.next = p1;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = new ListNode(2, l1);
        l1 = new ListNode(1, l1);

        ListNode l2 = null;//new ListNode(5);
//        l2 = new ListNode(4, l2);
//        l2 = new ListNode(3, l2);
//        l2 = new ListNode(1, l2);

        ListNode l3 = mergeTwoLists(l1, l2);

        while(l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }
}
