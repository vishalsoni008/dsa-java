package org.dsa.java.tree.binarytree;

public class BinaryTreeImplement {
    private TreeNode root;

    private static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data){
            this.data = data;
        }
    }

    private void create(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

    }

    private void preOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeImplement binaryTreeImplement = new BinaryTreeImplement();

        binaryTreeImplement.create();
        binaryTreeImplement.preOrderTraversal(binaryTreeImplement.root);

    }
}
