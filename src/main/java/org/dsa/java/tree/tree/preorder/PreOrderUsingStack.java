package org.dsa.java.tree.tree.preorder;

import java.util.Stack;

public class PreOrderUsingStack {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode root;

    void preOrder(TreeNode node){
        Stack<TreeNode> treeNodes = new Stack<>();

        treeNodes.add(node);

        while (!treeNodes.isEmpty()){
            TreeNode data = treeNodes.pop();
            System.out.print(data.data+" ");
            if(node.right != null){
                treeNodes.add(node.right);
            }
            if(node.left != null){
                treeNodes.add(node.left);
            }
        }
    }

    public static void main(String[] args) {

        PreOrderUsingStack preOrderUsingStack = new PreOrderUsingStack();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);

        preOrderUsingStack.root = treeNode;
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;

        preOrderUsingStack.preOrder(preOrderUsingStack.root);

    }
}
