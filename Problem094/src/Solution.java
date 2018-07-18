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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode now = root;
        while (now != null || !nodes.isEmpty()) {
            while (now != null) {
                nodes.push(now);
                now = now.left;
            }
            now = nodes.pop();
            result.add(now.val);
            now = now.right;
        }
        return result;
    }
}
