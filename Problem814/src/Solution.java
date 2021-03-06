public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        if(root==null)
            return null;

        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        if (root.left == null && root.right == null) {
            if(root.val==0)
                return null;
        }
        return root;
    }
}
