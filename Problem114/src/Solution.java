public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode node = root.left;
        if (node != null) {
            while (node.right != null) {
                node = node.right;
            }
            node.right=root.right;
            root.right=root.left;
            root.left=null;
        }
    }
}
