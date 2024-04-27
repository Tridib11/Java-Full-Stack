package BInary_Tree_Alpha;

public class SubTree_of_another_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.right=null;
        }
    }

    public static boolean isSubTree(Node root,Node subRoot){
        if(root.data==subRoot.data){
            if(isSame(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    private static boolean isSame(Node root, Node subRoot) {
        if(root==null && subRoot==null){
            return true;
        }else if(root==null || subRoot==null || root.data!=subRoot.data){
            return false;
        }
        if(!isSame(root.left,subRoot.left)){
            return false;
        }
        if(!isSame(root.right,subRoot.right)){
            return false;
        }
        return true;

    }
}
