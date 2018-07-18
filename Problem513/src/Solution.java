public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int maxDepth = 0;
    int mostleftValue = 0;

    public int findBottomLeftValue(TreeNode root) {
        find(root, 1);
        return mostleftValue;
    }

    public void find(TreeNode node, int depth) {
        if (depth>maxDepth){
            maxDepth=depth;
            mostleftValue=node.val;
        }
        if (node.left!=null)
        find(node.left,depth+1);
        if (node.right!=null)
            find(node.right,depth+1);
    }
}
