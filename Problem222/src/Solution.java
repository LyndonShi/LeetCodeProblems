public class Solution {
    public class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;

        public TreeNode(TreeNode right) {
            this.right = right;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
