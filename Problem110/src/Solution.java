public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    public int depth(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = depth(node.left) ;
        int rightDepth = depth(node.right) ;

        if (Math.abs(leftDepth - rightDepth) > 1 || leftDepth < 0 || rightDepth < 0)
            return -1;

        return Math.max(leftDepth,rightDepth)+1;
    }

}
