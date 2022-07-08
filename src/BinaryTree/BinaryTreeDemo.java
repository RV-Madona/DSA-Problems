package BinaryTree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insertAtLeft(tree.root,5);
        tree.insertAtRight(tree.root,15);
        tree.insertAtLeft(tree.root.left,3);
        tree.insertAtRight(tree.root.left,8);
        tree.insertAtLeft(tree.root.right,12);
       /* BinaryTree.PreOrder(tree.root);
        System.out.println();
        BinaryTree.InOrder(tree.root);
        System.out.println();
        BinaryTree.PostOrder(tree.root);*/
        System.out.println(BinaryTree.NoOfNodes(tree.root));
        BinaryTree.NodesAtLevel(tree.root,3);
    }
}
