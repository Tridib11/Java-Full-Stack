package BInary_Tree_Alpha;
import java.util.*;
public class kth_level_of_A_binaryTree_Preorder {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int k = 3; // Specify the level you want to find
        List<Integer> result = kthLevelNodes(root, k);
        System.out.println("Nodes at level " + k + ": " + result);
    }

    private static List<Integer> kthLevelNodes(Node root, int k) {
        List<Integer> result=new ArrayList<>();
        kthLevelNodeHelper(root,k,1,result);
        return result;
    }

    private static void kthLevelNodeHelper(Node root, int k, int currentLevel, List<Integer> result) {
        if(root==null){
            return;
        }
        if(currentLevel==k){
            result.add(root.data);
            return;
        }
        kthLevelNodeHelper(root.left,k,currentLevel+1,result);
        kthLevelNodeHelper(root.right,k,currentLevel+1,result);

    }


}
