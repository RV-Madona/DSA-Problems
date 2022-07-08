package BinaryTree;

import java.awt.*;

public class BinaryTree {
    class Node{
        int data;
        Node left,right;
        Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }
    Node root;
    BinaryTree(int val){
        root = new Node(val);
    }
    public  void insertAtLeft(Node r,int val){
        Node newNode = new Node(val);
        r.left = newNode;
    }
    public  void insertAtRight(Node r,int val){
        Node newNode = new Node(val);
        r.right = newNode;
    }
    public static void PreOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    public static void InOrder(Node root){
        if(root != null){
            InOrder(root.left);
            System.out.print(root.data+" ");
           InOrder(root.right);
        }
    }
    public static void PostOrder(Node root){
        if(root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.data+ sumOfNodes(root.left)+sumOfNodes(root.right);
    }
    public static int NoOfNodes(Node root){
       if(root==null){
           return 0;
       }
       return 1+NoOfNodes(root.left)+NoOfNodes(root.right);
    }
    public static void NodesAtLevel(Node root,int level){
        if(root == null){
            return;
        }
        if(level==1){
            System.out.println(root.data+" ");
        }
        NodesAtLevel(root.left,level-1);
        NodesAtLevel(root.right,level-1);
    }

}
