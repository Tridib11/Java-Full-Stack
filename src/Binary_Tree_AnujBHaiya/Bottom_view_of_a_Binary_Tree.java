package Binary_Tree_AnujBHaiya;
//https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

import java.util.*;

public class Bottom_view_of_a_Binary_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    static class Pair {
        int horizontal_Distance;
        Node node;

        Pair(int horizontal_Distance, Node node) {
            this.node = node;
            this.horizontal_Distance = horizontal_Distance;
        }
    }

    class Solution{
        public static ArrayList <Integer> bottomView(Node root)
        {
            Queue<Pair> queue=new ArrayDeque<>();
            Map<Integer,Integer> map=new TreeMap<>();
            queue.add(new Pair(0,root));
            while(!queue.isEmpty()){
                Pair curr=queue.poll();
                map.put(curr.horizontal_Distance,curr.node.data);
                if(curr.node.left!=null){
                    queue.add(new Pair(curr.horizontal_Distance-1,curr.node.left));
                }
                if(curr.node.right!=null){
                    queue.add(new Pair(curr.horizontal_Distance+1,curr.node.right));
                }
            }
            ArrayList<Integer> ans=new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                ans.add(entry.getValue());
            }
            return ans;
        }
    }


}
