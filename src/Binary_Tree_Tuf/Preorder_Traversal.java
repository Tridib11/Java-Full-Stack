package Binary_Tree_Tuf;
/*
(Root, left, Right)
 */
import java.util.ArrayList;
import java.util.List;

public class Preorder_Traversal {
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

    public static void preOrder(Node node,List<Integer> res){
        if(node==null){
            return;
        }
        res.add(node.data);
        preOrder(node.left,res);
        preOrder(node.right,res);
    }
    public static List<Integer> preorder(Node root){
        List<Integer> res=new ArrayList<>();
        preOrder(root,res);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = preorder(root);

        // Displaying the inorder traversal result
        System.out.print("PreOrder Traversal: ");
        // Output each value in the
        // inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


}
