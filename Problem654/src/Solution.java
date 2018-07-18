import com.sun.jdi.Value;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode root;


        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return  addNode(nums, 0, nums.length);


    }

    public TreeNode addNode(int[] nums, int L, int R) {
        if (L == R) {
            return null;
        }
        int maxID = maxIndex(nums, L, R);
        TreeNode root = new TreeNode(nums[maxID]);
        root.left = addNode(nums, L, maxID);
        root.right = addNode(nums, maxID+1, R);
        return root;
    }

    public int maxIndex(int[] nums, int L, int R) {
        int max = L;
        for (int i = L; i < R; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

}