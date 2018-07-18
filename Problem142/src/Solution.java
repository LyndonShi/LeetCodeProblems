public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {

                ListNode marker=head;
                while (marker!=slow){
                    marker=marker.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
