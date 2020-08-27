package tyagiabhinav.leetcode;

public class MergeKSortedLinkedLists {

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

    public static ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if(size == 0) return null;
        if(size == 1) return lists[0];
        ListNode l1 = lists[0];
        for(int i=1; i<size; i++){
            l1 = mergeTwoLists(l1,lists[i]);
        }

        return l1;
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = (l1 == null)? l2 : l1;
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = new ListNode(2, l1);
        l1 = new ListNode(1, l1);

        ListNode l2 = new ListNode(5);
        l2 = new ListNode(4, l2);
        l2 = new ListNode(3, l2);
        l2 = new ListNode(1, l2);

        ListNode l3 = new ListNode(8);
        l3 = new ListNode(5, l3);
        l3 = new ListNode(3, l3);
        l3 = new ListNode(1, l3);

        ListNode[] list = {l1,l2,l3};
        ListNode l = mergeKLists(list);

        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }

}
