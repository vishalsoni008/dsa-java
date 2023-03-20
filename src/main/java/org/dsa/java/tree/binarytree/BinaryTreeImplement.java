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
        //op 1 2 4 5 3
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

    private void inOrderUsingRecursion(TreeNode root){
        if(root == null){
            return;
        }
        inOrderUsingRecursion(root.left);
        System.out.print(root.data+" ");
        inOrderUsingRecursion(root.right);
        //op 4 2 5 1 3
    }

    private void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
        //op - 4 5 2 3 1
    }

    public static void main(String[] args) {

        BinaryTreeImplement binaryTreeImplement = new BinaryTreeImplement();

        binaryTreeImplement.create();
        System.out.println("presorder using recursion");
        binaryTreeImplement.preOrderTraversalUsingRecursion(binaryTreeImplement.root);
        System.out.println();
        System.out.println("presorder using iteration");
        binaryTreeImplement.preOrderUsingItration();

        System.out.println();
        System.out.println("in order using recursion");
        binaryTreeImplement.inOrderUsingRecursion(binaryTreeImplement.root);

        System.out.println();
        System.out.println("post order using recursion");
        binaryTreeImplement.postOrder(binaryTreeImplement.root);

    }
}
