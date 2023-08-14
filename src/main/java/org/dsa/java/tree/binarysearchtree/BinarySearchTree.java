package org.dsa.java.tree.binarysearchtree;

public class BinarySearchTree {
    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data) {
            this.data = data;
        }
    }

    private TreeNode root;

    private void insertIntoBinarySearchTree(int val){
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(val<root.data){
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    private void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");

        preOrder(root.left);
        preOrder(root.right);
    }

    private TreeNode searchElement(TreeNode root, int val){
        if(root == null ||val == root.data){
            return root;
        }
        if(val< root.data){
            return searchElement(root.left, val);
        }
        else{
            return searchElement(root.right,val);
        }
    }


    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insertIntoBinarySearchTree(6);
        binarySearchTree.insertIntoBinarySearchTree(4);
        binarySearchTree.insertIntoBinarySearchTree(8);
        binarySearchTree.insertIntoBinarySearchTree(2);
        binarySearchTree.insertIntoBinarySearchTree(5);
        binarySearchTree.insertIntoBinarySearchTree(7);
        binarySearchTree.insertIntoBinarySearchTree(9);

        binarySearchTree.preOrder(binarySearchTree.root);

        System.out.println();
        TreeNode node = binarySearchTree.searchElement(binarySearchTree.root, 19);

        if (node == null) {
            System.out.println("element is not present");
        } else {
            System.out.println("element is present " + node.data);
        }
    }
}