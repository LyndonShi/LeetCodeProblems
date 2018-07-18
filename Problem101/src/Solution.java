public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return itsMirror(root.left, root.right);
    }

    public boolean itsMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return left.val == right.val && itsMirror(left.left, right.right) && itsMirror(left.right, right.left);
    }
}
