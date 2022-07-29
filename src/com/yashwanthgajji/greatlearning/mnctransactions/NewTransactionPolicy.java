package com.yashwanthgajji.greatlearning.mnctransactions;

//Class for new Transaction requirement
public class NewTransactionPolicy {
    //Static function to apply new policy
    public static BinarySearchTree convertTransactionToNewPolicy(BinarySearchTree transactions) {
        BinarySearchTree.Node rootTransaction = transactions.getRoot();
        BinarySearchTree newTransactions = new BinarySearchTree();
        convertBSTToRightSkewed(rootTransaction, newTransactions);
        return newTransactions;
    }

    //Recursive function to change BST to right skewed tree
    private static void convertBSTToRightSkewed(BinarySearchTree.Node root, BinarySearchTree newTransactions) {
        if(root == null) {
            return;
        }
        convertBSTToRightSkewed(root.left, newTransactions);
        newTransactions.insert(root.data);
        convertBSTToRightSkewed(root.right, newTransactions);
    }
}
