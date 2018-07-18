public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;

        if(root.val<L)return trimBST(root.right,L,R);
        if (root.val>R)return trimBST(root.left,L,R);
        root.left=trimBST(root.left,L,R);
        root.right=trimBST(root.right,L,R);
        return root;
    }
}
