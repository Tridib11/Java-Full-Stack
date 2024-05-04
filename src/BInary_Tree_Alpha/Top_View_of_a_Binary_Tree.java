package BInary_Tree_Alpha;
//https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1
import java.util.*;

public class Top_View_of_a_Binary_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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


    class Solution {
        static ArrayList<Integer> topView(Node root) {
            Queue<Pair> queue = new ArrayDeque<>();
            Map<Integer, Integer> map = new TreeMap<>(); //used to store data in sorted order of keys
            queue.add(new Pair(0,root));
            while(!queue.isEmpty()){
                Pair curr=queue.poll();
                if(!map.containsKey(curr.horizontal_Distance)){
                    map.put(curr.horizontal_Distance, curr.node.data);
                }
                if(curr.node.left!=null){
                    queue.add(new Pair(curr.horizontal_Distance-1,curr.node.left ));
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
