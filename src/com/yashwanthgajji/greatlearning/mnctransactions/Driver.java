package com.yashwanthgajji.greatlearning.mnctransactions;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Loading Transactions...");
        //Generating initial BST
        BinarySearchTree transactions = new BinarySearchTree();
        transactions.insert(50);
        transactions.insert(30);
        transactions.insert(60);
        transactions.insert(10);
        transactions.insert(55);
        //Print all transactions before new requirement
        System.out.println("All transactions:");
        transactions.inorder();
        //Apply new requirement
        transactions = NewTransactionPolicy.convertTransactionToNewPolicy(transactions);
        //Print all transactions after new requirement
        System.out.println("Transactions after new policy...");
        transactions.inorder();
    }
}
