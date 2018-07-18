public class Solution {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
//        if(nums==null||nums.length==0){
//            return null;
//        }
        return insertNode(nums, 0, nums.length - 1);
    }
    private TreeNode insertNode(int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int mid =(begin + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertNode(nums, begin, mid-1);
        root.right = insertNode(nums, mid+1, end);
        return root;
    }

}
