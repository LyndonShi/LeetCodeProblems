public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int totalTile = 0;

    public int findTilt(TreeNode root) {
        traveling(root);
        return totalTile;
    }

    public int traveling(TreeNode root) {
        if (root == null) return 0;
        int left = traveling(root.left);
        int right = traveling(root.right);
        totalTile += Math.abs(left - right);
        return left + right + root.val;
    }

//    public int findTilt(TreeNode root) {
//        if (root == null) return 0;
//        else if (root.right == null && root.left == null) return 0;
//        else if (root.left == null) {
//            root.val = root.val + root.right.val;
//            return root.right.val + findTilt(root.right);
//
//        } else if (root.right == null) {
//            root.val = root.val + root.left.val;
//            return root.left.val + findTilt(root.left);
//        } else {
//            root.val = root.left.val + root.right.val + root.val;
//            return Math.abs(root.left.val - root.right.val) + findTilt(root.left) + findTilt(root.right);
//        }
//    }
//        int result = 0;
//
//        return  helper(root, result);
//    }

//    public int helper(TreeNode root, int result) {
//        if (root.left == null && root.right == null) {
//            return 0;
//        } else if (root.left == null) {
//            result = result + Math.abs(root.right.val)+  helper(root.right, result);
//
//        } else if (root.right == null) {
//            result = result + Math.abs(root.left.val)+  helper(root.left, result);
//
//        } else {
//            result = result + Math.abs(root.left.val - root.right.val)+  helper(root.left, result)+  helper(root.right, result);
//
//        }
//        return result;
//    }
}
