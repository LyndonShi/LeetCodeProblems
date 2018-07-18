public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int sumOfLeftLeaves(TreeNode root) {
        int returnValue = 0;
        if (root == null) {
            return returnValue;
        }
        if (root.left != null&&root.left.left==null&&root.left.right==null) {
            returnValue = root.left.val;
        }
        returnValue = returnValue + sumOfLeftLeaves(root.right)+sumOfLeftLeaves(root.left);


        return returnValue;

    }
}
