// Author:	Nicholas Nguyen
// Date:	10/11/2020
// Class:	CS 3310.02

import java.util.Random;
import java.util.ArrayList;

class Node {
	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
	}
} // end Node

public class BST {
	// Root of binary search tree
	Node root;

	// Constructor
	BST() {
		root = null;
	}

	// Utility function for inorder traversal of the tree
	void inorderUtil(Node node) {
		if (node == null)
			return;

		inorderUtil(node.left);
		System.out.print(node.data + " ");
		inorderUtil(node.right);
	} // end inOrderUtil

	// Calls newLeaf
	void insert(int key) {
		root = newLeaf(root, key);
	} // end insert

	/* A recursive function to insert a new key in BST */
	Node newLeaf(Node root, int data) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(data);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (data < root.data)
			root.left = newLeaf(root.left, data);
		else if (data > root.data)
			root.right = newLeaf(root.right, data);

		return root;
	} // end newLeaf

	// Method that adds values of given tree into ArrayList
	ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list) {
		// Base Case
		if (node == null)
			return list;
		treeToList(node.left, list);
		list.add(node.data);
		treeToList(node.right, list);
		return list;
	} 

	// Check to find a pair of values
	boolean searchPair(Node node, int target) {
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = treeToList(node, a1);
		int start = 0; 
		int end = a2.size() - 1; 
		while (start < end) {
			if (a2.get(start) + a2.get(end) == target) // Finding Target
			{
				System.out
						.println("Numbers found in tree: " + a2.get(start) + " + " + a2.get(end) + " " + "= " + target);
				return true;
			}
			if (a2.get(start) + a2.get(end) > target) // End of decrements
			{
				end--;
			}
			if (a2.get(start) + a2.get(end) < target) // Start of increments
			{
				start++;
			}
		}
		System.out.println("No such values are found!");
		return false;
	} // END

	public static void main(String[] args) {
		// Create objects of BinarySearchTree
		BST tree1 = new BST();
		BST tree2 = new BST();
		BST tree3 = new BST();
		BST tree4 = new BST();
		BST tree5 = new BST();

		Random rand = new Random();
		// Randomly generate an int for randomSum between -200 and 200
		int randomSum1 = rand.nextInt(400) - 200;
		int randomSum2 = rand.nextInt(400) - 200;
		int randomSum3 = rand.nextInt(400) - 200;
		int randomSum4 = rand.nextInt(400) - 200;
		int randomSum5 = rand.nextInt(400) - 200;

		// Fill tree with 100 random values between -100 and 100
		for (int i = 0; i < 100; i++) {
			tree1.insert(rand.nextInt(200) - 100);
			tree2.insert(rand.nextInt(200) - 100);
			tree3.insert(rand.nextInt(200) - 100);
			tree4.insert(rand.nextInt(200) - 100);
			tree5.insert(rand.nextInt(200) - 100);
		}


		for (int n = 1; n < 6; n++) {
			System.out.println("Tree " + n + ":");
			if (n == 1) {
				System.out.println("The randomly generated number is: " + randomSum1);
				long nano_tree1_startTime1 = System.nanoTime();
				tree1.searchPair(tree1.root, randomSum1);
				long nano_tree1_endTime1 = System.nanoTime();
				System.out.println("Elapsed time: " + (nano_tree1_endTime1 - nano_tree1_startTime1) + " ns.\n");
			} else if (n == 2) {
				System.out.println("The randomly generated number is: " + randomSum2);
				long nano_tree1_startTime1 = System.nanoTime();
				tree2.searchPair(tree2.root, randomSum2);
				long nano_tree1_endTime1 = System.nanoTime();
				System.out.println("Elapsed time: " + (nano_tree1_endTime1 - nano_tree1_startTime1) + " ns.\n");
			}
			else if (n == 3) {
				System.out.println("The randomly generated number is: " + randomSum3);
				long nano_tree1_startTime1 = System.nanoTime();
				tree3.searchPair(tree3.root, randomSum3);
				long nano_tree1_endTime1 = System.nanoTime();
				System.out.println("Elapsed time: " + (nano_tree1_endTime1 - nano_tree1_startTime1) + " ns.\n");
			}
			else if (n == 4) {
				System.out.println("The randomly generated number is: " + randomSum4);
				long nano_tree1_startTime1 = System.nanoTime();
				tree4.searchPair(tree3.root, randomSum4);
				long nano_tree1_endTime1 = System.nanoTime();
				System.out.println("Elapsed time: " + (nano_tree1_endTime1 - nano_tree1_startTime1) + " ns.\n");
			}
			else if (n == 5) {
				System.out.println("The randomly generated number is: " + randomSum5);
				long nano_tree1_startTime1 = System.nanoTime();
				tree5.searchPair(tree5.root, randomSum5);
				long nano_tree1_endTime1 = System.nanoTime();
				System.out.println("Elapsed time: " + (nano_tree1_endTime1 - nano_tree1_startTime1) + " ns.\n");
			}
			else {
				System.out.println("ERROR!");
			}
		}
	} // END OF MAIN
}
