import java.util.LinkedList;
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
       if(root!=null) findPath(root,"",result);
        return result;
    }
    private void findPath(TreeNode root,String path,List<String> paths){
        if(root.left==null&&root.right==null)paths.add(path+root.val) ;
        if(root.left!=null)findPath(root.left,path+root.val+"->",paths);
        if(root.right!=null)findPath(root.right,path+root.val+"->",paths);

    }
}
