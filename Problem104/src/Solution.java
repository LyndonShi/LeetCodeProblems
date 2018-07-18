import javax.swing.tree.TreeNode;

public class Solution {
    public class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
           return 0;
        }
//        if(root.left==null)
//            return maxDepth(root.right)+1;
//        if(root.right==null){
//            return maxDepth(root.left)+1;
//        }

        return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }

}
