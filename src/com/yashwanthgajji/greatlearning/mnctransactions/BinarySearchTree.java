package com.yashwanthgajji.greatlearning.mnctransactions;

//BinarySearchTree class
public class BinarySearchTree {
    //TreeNode
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    //return root of the tree
    public Node getRoot() {
        return root;
    }

    //Function to insert a new data into tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    //Internal recursion function for insertion
    private Node insertRec(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        if(data<root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    //Displaying tree in inorder
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    //Internal recursion function for inorder
    private void inorderRec(Node root) {
        if(root == null) {
            return;
        }
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }
}
