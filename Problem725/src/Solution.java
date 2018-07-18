public class Solution {
    public class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        int totalLenth = 0;
        ListNode lenth=root;
        while (lenth != null) {
            totalLenth++;
            lenth = lenth.next;
        }
        int partLenth = totalLenth / k;
        int remainder = totalLenth % k;
        ListNode head = root;

        for (int i = 0; i < k&&head!=null; i++) {
            result[i] = head;
            for (int j = 0; j < partLenth + (i < remainder ? 1 : 0)-1; j++) {
                head = head.next;
            }
            ListNode temp=head.next;
            head.next=null;
            head=temp;
        }

        return result;

    }
}
