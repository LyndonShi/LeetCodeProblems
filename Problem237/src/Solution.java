public class Solution {
    public class  ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public void deleteNode(ListNode node) {
       node.val=node.next.val;
       node.next=node.next.next;

    }
}
