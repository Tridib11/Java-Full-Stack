package Binary_Tree_Tuf;
import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preOrder(root,res);
        return res;
    }
    public void preOrder(TreeNode node,List<Integer> res){
        if(node == null){
            return ;
        }
        res.add(node.val);
        preOrder(node.left,res);
        preOrder(node.right,res);
    }
}
public class PreOrder_Leetcode {
}
