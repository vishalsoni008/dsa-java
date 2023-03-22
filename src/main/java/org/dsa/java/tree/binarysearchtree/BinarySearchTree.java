package org.dsa.java.tree.binarysearchtree;

public class BinarySearchTree {

    private static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data){
            this.data = data;
        }
    }

    private TreeNode root;

    private void insert(int value){
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode root, int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value< root.data){
            root.left = insert(root.left, value);
        }
        else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    private void preOrder(TreeNode root){
        if (root == null){
                return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(8);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(9);

        binarySearchTree.preOrder(binarySearchTree.root);
    }
}
