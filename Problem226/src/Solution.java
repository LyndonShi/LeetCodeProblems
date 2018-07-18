public class Solution {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode invert;
        if (root==null)
        {
            return root;
        }

            invert= root.left;
            root.left=root.right;
            root.right=invert;


            invertTree(root.left);
            invertTree(root.right);
        return root;
    }
}
