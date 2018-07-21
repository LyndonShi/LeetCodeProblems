import java.util.ArrayList;
import java.util.List;

public class Solution {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        nodesOfLevel(root,0,result);
        return result;
    }
    public void nodesOfLevel(TreeNode root,int depth,List<List<Integer>>result){
        if (root==null)return;
        if (depth<result.size()){
            result.get(result.size()-1-depth).add(root.val);
        }else{
            List<Integer>newLevel=new ArrayList<>();
            newLevel.add(root.val);
            result.add(0,newLevel);
        }
        nodesOfLevel(root.left,depth+1,result);
        nodesOfLevel(root.right,depth+1,result);
    }
}
