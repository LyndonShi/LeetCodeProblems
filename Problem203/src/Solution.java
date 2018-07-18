public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head== null) {
            return null;
        }
        head.next=removeElements(head.next, val);
        return head.val==val ?head.next:head;
    }
}
