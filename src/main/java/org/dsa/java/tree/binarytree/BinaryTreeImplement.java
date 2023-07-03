package org.dsa.java.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeImplement {
    private TreeNode root;

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

        System.out.println();
        System.out.println("level traversall");
        binaryTreeImplement.traversalLevelWise(binaryTreeImplement.root);

        // System.out.println();
        System.out.println("max value is ");
        System.out.println(binaryTreeImplement.maxValue(binaryTreeImplement.root));
    }

    private void create() {
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

    private void preOrderTraversalUsingRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversalUsingRecursion(root.left);
        preOrderTraversalUsingRecursion(root.right);
        //op 1 2 4 5 3
    }

    private void preOrderUsingItration() {
        if (root == null)
            return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.empty()) {
            TreeNode temp = st.pop();

            System.out.print(temp.data + " ");

            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }
    }

    private void inOrderUsingRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderUsingRecursion(root.left);
        System.out.print(root.data + " ");
        inOrderUsingRecursion(root.right);
        //op 4 2 5 1 3
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
        //op - 4 5 2 3 1
    }

    private void traversalLevelWise(TreeNode root) {
        int level = 0;
        if (root == null) {
            return;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);

        while (!treeNodes.isEmpty()) {
            TreeNode temp = treeNodes.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                //level++;
                treeNodes.offer(temp.left);
            }
            if (temp.right != null) {
                level++;
                treeNodes.offer(temp.right);
            }
        }
        System.out.println();
        System.out.println("levels are " + level);
        // op 1 2 3 4 5
    }

    private int maxValue(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;

        int left = maxValue(root.left);
        int right = maxValue(root.right);

        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
        return result;
    }

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data) {
            this.data = data;
        }
    }
}
