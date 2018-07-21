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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<Integer> nodeCount = new ArrayList<>();
        average(root, 0, result, nodeCount);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / nodeCount.get(i));
        }
        return result;
    }

    public void average(TreeNode root, int depth, List<Double> result, List<Integer> count) {
        if (root == null) return;
        if (depth < result.size()) {
            result.set(depth, result.get(depth) + root.val);
            count.set(depth, count.get(depth) + 1);
        } else {
            result.add(1.0 * root.val);
            count.add(1);
        }
        average(root.left, depth + 1, result, count);
        average(root.right, depth + 1, result, count);

    }
}
