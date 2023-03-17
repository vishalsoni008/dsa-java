package org.dsa.java.tree.binarytree;

import java.util.Stack;

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

    private void preOrderTraversalUsingRecursion(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversalUsingRecursion(root.left);
        preOrderTraversalUsingRecursion(root.right);
    }
    private void preOrderUsingItration(){
        if(root == null)
            return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.empty()){
            TreeNode temp = st.pop();

            System.out.print(temp.data +" ");

            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null){
                st.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {

        BinaryTreeImplement binaryTreeImplement = new BinaryTreeImplement();

        binaryTreeImplement.create();
        System.out.println("presorder using recursion");
        binaryTreeImplement.preOrderTraversalUsingRecursion(binaryTreeImplement.root);
        System.out.println();
        System.out.println("presorder using iteration");
        binaryTreeImplement.preOrderUsingItration();

    }
}
