public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
    }



    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return path(root, sum) +
                pathSum(root.left, sum) +
                pathSum(root.right, sum);
    }

    public int path(TreeNode root, int sum) {
        if (root == null) return 0;
        return (sum == root.val ? 1 : 0) +
                path(root.right, sum - root.val) +
                path(root.left, sum - root.val);
    }
}
