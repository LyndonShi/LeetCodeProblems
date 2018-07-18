public class Solution {
    public class ListNode{
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode starting=new ListNode(0);
        starting.next=head;
        ListNode pre=starting;
        ListNode now=head;
        int len=n-m;
        while (m>1){
            pre=pre.next;
            now=now.next;
            m--;
        }
        while (len>0){
            ListNode subHead=now.next;
            now.next=subHead.next;
            subHead.next=pre.next;
            pre.next=subHead;
            len--;
        }
        return starting.next;
    }
}
