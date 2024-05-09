package Binary_Tree_AnujBHaiya;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
import java.util.*;
public class Lowest_Common_Ancestor_Leetcode {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val==p.val || root.val==q.val) return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null) return right;
        if(right==null) return left;

        return root;
    }





}
