public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return minDepth(root, 1);
    }

    public int minDepth(TreeNode root, int depth) {
        if (root.left == null && root.right == null) return depth;
        else if (root.left == null) return minDepth(root.right, depth + 1);
        else if (root.right == null) return minDepth(root.left, depth + 1);
        else return Math.min(minDepth(root.left, depth + 1), minDepth(root.right, depth + 1));
    }
}
