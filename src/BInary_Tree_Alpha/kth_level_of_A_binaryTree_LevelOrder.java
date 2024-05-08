package BInary_Tree_Alpha;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
import java.util.*;

public class kth_level_of_A_binaryTree_LevelOrder {
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

    public static List<Integer> kthLevelNodes(Node root,int k){
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);

        int currentLevel=1;
        while(!queue.isEmpty()){
            int currentLevelSize= queue.size();
            if(currentLevel==k){
                for(int i=0;i<currentLevelSize;i++){
                    Node node=queue.poll();
                    result.add(node.data);
                }
                return result;
            }

            for(int i=0;i<currentLevelSize;i++){
                Node node=queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            currentLevel++;
        }
        return result;
    }


}
