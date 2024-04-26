package Binary_Tree_Tuf;
//https://leetcode.com/problems/diameter-of-binary-tree/
public class Diameter_of_a_binaryTree {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public int diameterOfBinaryTree(TreeNode root) {
            int[] diameter=new int[1];
            height(root,diameter);
            return diameter[0];
        }

        private int height(TreeNode root, int[] diameter) {
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left,diameter);
            int rightHeight=height(root.right,diameter);
            diameter[0]=Math.max(diameter[0],leftHeight+rightHeight);
            return 1+Math.max(leftHeight,rightHeight);
        }

    }
}
