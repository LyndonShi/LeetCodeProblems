import java.util.ArrayList;
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        if (root==null)return result;

        nodes.push(root);
        while (!nodes.isEmpty()) {
           TreeNode node = nodes.pop();
            result.add(node.val);
            if (node.right != null)
                nodes.push(node.right);
            if (node.left != null)
                nodes.push(node.left);
        }
        return result;
    }
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        if (root == null) return result;
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode node = stack.pop();
//            result.add(node.val);
//            if (node.right != null) stack.push(node.right);
//            if (node.left != null) stack.push(node.left);
//        }
//        return result;
//    }

}
