package Binary_Tree_Tuf;
import java.util.*;
/*
 * Definition for a binary tree node.
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
  class TreeInNode {
      int val;
      TreePreNode left;
      TreePreNode right;
      TreeInNode() {}
      TreeInNode(int val) { this.val = val; }
      TreeInNode(int val, TreePreNode left, TreePreNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

 class Solution_InOrder {
    public List<Integer> inorderTraversal(TreePreNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;
    }
    public void inorder(TreePreNode node, List<Integer> res){
        if(node==null){
            return;
        }
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }
}
public class Inorder_Leetcode {

}
