import java.util.ArrayList;
import java.util.List;

public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        findPath(root, sum, path, result);
        return result;
    }

    public void findPath(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) return;
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(path));
            return;
        }
        if (root.left != null) {
            findPath(root.left, sum, path, result);
           path.remove(path.size()-1);
        }
        if (root.right != null) {
            findPath(root.right, sum, path, result);
            path.remove(path.size()-1);
        }
    }
}
