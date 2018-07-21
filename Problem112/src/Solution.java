public class Solution {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)return false;
        sum-=root.val;
        if (root.left==null&&root.right==null)return sum==0;
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }
}
