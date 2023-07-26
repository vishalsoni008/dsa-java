package org.dsa.java.tree.tree.postorder;

public class PostOrder {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode root;

    void postOrderTraversal(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        postOrderTraversal(treeNode.left);
        postOrderTraversal(treeNode.right);
        System.out.print(treeNode.data+" ");
    }

    public static void main(String[] args) {

        PostOrder postOrder = new PostOrder();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);

        postOrder.root = treeNode;
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;

        postOrder.postOrderTraversal(postOrder.root);
    }
}
