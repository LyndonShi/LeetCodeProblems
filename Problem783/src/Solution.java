public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int minDiff = Integer.MAX_VALUE;
    TreeNode previous;

    public int minDiffInBST(TreeNode root) {
        findMinDiff(root);
        return minDiff;
    }

    public void findMinDiff(TreeNode root) {
        if (root == null) return;
        findMinDiff(root.left);
        if (previous !=null) minDiff=Math.min(minDiff,root.val-previous.val);
        previous=root;
        findMinDiff(root.right);
    }

//    public int minDiffInBST(TreeNode root) {
//
//        if (root == null) return Integer.MAX_VALUE;
//        int leftMin;
//        int rightMin;
//
//        if (root.left == null)
//            leftMin = Integer.MAX_VALUE;
//        else leftMin = root.val - root.left.val;
//        if (root.right == null)
//            rightMin = Integer.MAX_VALUE;
//        else rightMin = root.right.val - root.val;
//
//        leftMin = Math.min(leftMin, minDiffInBST(root.left));
//        rightMin = Math.min(rightMin, minDiffInBST(root.right));
//
//        return Math.min(leftMin, rightMin);
//    }

//        if (root == null) return minDiff;
//
//
//        leftMin = Math.min(minDiffInBST(root.left), leftMin);
//        rightMin = Math.min(minDiffInBST(root.right), rightMin);
//
//        return Math.min(rightMin,leftMin);
//
//    }
}
