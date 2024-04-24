package BInary_Tree_Alpha;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class testing_LevelOrder {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> currentLevel = new ArrayList<>();
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                result.add(currentLevel);
                currentLevel=new ArrayList<>();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                currentLevel.add(currNode.data);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

    }
}
