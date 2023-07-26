package org.dsa.java.tree.tree.inorder;

public class InOrderUsingRecursion {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    public void inOrderTraversall(TreeNode tree){
        if(tree == null){
            return;
        }
        inOrderTraversall(tree.left);
        System.out.print(tree.data+" ");
        inOrderTraversall(tree.right);
    }

    TreeNode root;
    public static void main(String[] args) {

        InOrderUsingRecursion inOrderUsingRecursion = new InOrderUsingRecursion();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);

        inOrderUsingRecursion.root = treeNode;
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;

        inOrderUsingRecursion.inOrderTraversall(inOrderUsingRecursion.root);

    }
}
