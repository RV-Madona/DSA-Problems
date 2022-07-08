package BinaryTree;

public class BinarySearchTree {
    class Node{
        int key;
        Node left;
        Node right;
        Node(int val){
           key = val;
           left = right = null;
        }
    }
    Node root;

    BinarySearchTree(int val){

        root = new Node(val);
    }
    BinarySearchTree(){
        root = null;
    }
    public void insert(int val){


        insert(root,val);
    }
    public Node insert(Node root,int val){
        if(root == null){
           return new Node(val);
        }
        if(val < root.key ){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }
    public void search(Node root,int val){
        if(root == null){
            System.out.println("Key Not Found.");
            return;
        }
        if(root.key == val){
            System.out.println("Key Found.");
            return;
        }
        else if(val<root.key){
            search(root.left,val);
        }
        else {
            search(root.right,val);
        }
    }
    public void searchInLoop(Node root,int val){
        int flag = 0;
        while(root !=null){
            if(val == root.key){
               flag = 1;
               break;
            }
            else if(val< root.key){
               root = root.left;
            }
            else{
                root =root.right;
            }
        }
        if(flag == 1){
            System.out.println("key Found.");
        }
        else{
            System.out.println("Key Not Found.");
        }
    }
    public Node searchBST(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.key) {
             searchBST(root.left, val);
        } else if (val > root.key) {
            searchBST(root.right, val);
        } else {

            return root;
        }
        return root;
    }
        public Node delete(Node root,int val){
        if(root == null){
            System.out.println("key to be deleted is not found ");
            return root;
        }
        if(val < root.key)
             root.left=delete(root.left,val);
        else if(val> root.key)
            root.right = delete(root.right,val);
        else{

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return  root.left;
            }
            else {
                root.key = min(root.right);
               root.right =  delete(root.right, root.key);
            }
        }
        return  root;
    }
    public int min(Node root){
        int minValue = 0;
        while(root != null){
            minValue = root.key;
            root=root.left;
        }
        return minValue;
    }
}
