import java.util.ArrayList;
import java.util.List;

public class Solution {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        leveleOrder(result,root,0);
        return result;
    }

    private void leveleOrder(List<List<Integer>> result, TreeNode node,int depth){
        if (node==null)return;
        if (depth<result.size()){
            result.get(depth).add(node.val);
        }else{
            List<Integer> newLevel=new ArrayList<>();
            newLevel.add(node.val);
           result.add(newLevel);
        }
        leveleOrder(result,node.left,depth+1);
        leveleOrder(result,node.right,depth+1);
    }
}
