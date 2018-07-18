public class Solution {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root.val<Math.min(p.val,q.val))return lowestCommonAncestor(root.right,p,q);
        if (root.val>Math.max(p.val,q.val))return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}