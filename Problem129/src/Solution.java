public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        sumHelper(root,root.val);
        return sum;
    }
    public void sumHelper(TreeNode node, int curVal) {
        if (node.left == null && node.right == null) {
            sum = sum + curVal;
        }
        if (node.left != null)
            sumHelper(node.left, curVal * 10 + node.left.val);
        if (node.right != null)
            sumHelper(node.right, curVal * 10 + node.right.val);
    }
}
