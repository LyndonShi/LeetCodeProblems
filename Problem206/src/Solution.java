public class Solution {
    public class ListNode{
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode pre=start;
        ListNode now=head;
        while (now!=null&&now.next!=null){
            ListNode newHead= now.next;

            now.next=newHead.next;
            newHead.next=pre.next;
            pre.next=newHead;
        }
        return start.next;
    }
}
