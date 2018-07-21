public class Solution {
    public class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;
        ListNode helper = new ListNode(0);
        ListNode cur = head;
        ListNode pre = helper;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            while (pre.next!=null&&pre.next.val<cur.val){
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            pre=helper;
            cur=next;
        }
        return helper.next;
    }
}
