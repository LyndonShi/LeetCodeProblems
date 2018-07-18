public class Solution {
    public class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenthA=NodeLenth(headA);
        int lenthB=NodeLenth(headB);
        ListNode temp;
        if(lenthA>lenthB){
            temp=sameLenth(headA,lenthA-lenthB);
          return   findSame(temp,headB);
        }else {
            temp=sameLenth(headB,lenthB-lenthA);
            return findSame(temp,headA);
        }



    }
    private ListNode findSame(ListNode n1,ListNode n2){
        while (n1!=n2){
            n1=n1.next;
            n2=n2.next;
        }
        return n1;
    }
    private ListNode sameLenth(ListNode node,int dif){

        for (int i=0;i<dif;i++){
            node=node.next;
        }
            return node;
    }
    private int NodeLenth(ListNode node){
        if(node==null)
            return 0;
        return NodeLenth(node.next)+1;
    }
}
