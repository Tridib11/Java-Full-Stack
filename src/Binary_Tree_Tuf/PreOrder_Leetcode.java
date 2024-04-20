package Binary_Tree_Tuf;
import java.util.*;

//https://leetcode.com/problems/binary-tree-preorder-traversal/


class TreePreNode {
    int val;
    TreePreNode left;
    TreePreNode right;
    TreePreNode() {}
    TreePreNode(int val) { this.val = val; }
    TreePreNode(int val, TreePreNode left, TreePreNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution_PreOrder {
    public List<Integer> preorderTraversal(TreePreNode root) {
        List<Integer> res=new ArrayList<>();
        preOrder(root,res);
        return res;
    }
    public void preOrder(TreePreNode node, List<Integer> res){
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
