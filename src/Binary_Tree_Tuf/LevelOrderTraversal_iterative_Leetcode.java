package Binary_Tree_Tuf;
import com.sun.source.tree.Tree;
//https://leetcode.com/problems/binary-tree-level-order-traversal/
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LevelOrderTraversal_iterative_Leetcode {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currLevel=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                currLevel.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            result.add(currLevel);
        }
        return result;
    }


}
