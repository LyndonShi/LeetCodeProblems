public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode temp;
    public void flatten(TreeNode root) {

        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        if(root.right==null){
            root.right=temp;
            temp=root;
            return;

//            root.right=root.left;
//            root.left=null;
//            return;
        }
        if(root.left.right==null){
            root.left.left.right=root.right;
        }

        root.left.right = root.right;
        root.right = root.left;
        root.left = null;
    }


}
