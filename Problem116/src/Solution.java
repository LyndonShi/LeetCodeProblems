public class Solution {
    public class TreeLinkNode{
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
    }
    public void connect(TreeLinkNode root) {
        TreeLinkNode levelStarter=root;
        while (levelStarter!=null){
            TreeLinkNode cur=levelStarter;
            while (cur!=null){
                if (cur.left!=null)cur.left.next=cur.right;
                if (cur.next!=null&&cur.right!=null)cur.right.next=cur.next.left;
                cur=cur.next;
            }
            levelStarter=levelStarter.left;
        }
    }
}
