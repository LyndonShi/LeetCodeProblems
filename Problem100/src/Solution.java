public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p!=null&&q!=null&&p.val == q.val) {
            if(isSameTree(p.left,q.left))
                if (isSameTree(p.right,q.right))
                    return true;
        }
        return false;
    }
}
