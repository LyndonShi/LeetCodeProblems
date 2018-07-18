import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> nodes = new Stack<>();
        if (root == null) return result;
        nodes.push(root);
        while (!nodes.isEmpty()) {
            TreeNode now = nodes.pop();
            ((LinkedList<Integer>) result).addFirst(now.val);
            if (now.left != null) nodes.push(now.left);
            if (now.right != null) nodes.push(now.right);
        }
        return result;
    }
}
