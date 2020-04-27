package ProblemSet;

import java.util.Scanner;

public class TreeNode {

	Scanner sc = new Scanner(System.in);

// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
	private class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public TreeNode() {
		this.root = CreateBinaryTree(null, false);
		// this.root=construct(null, false);
	}

	private Node CreateBinaryTree(Node parent, boolean ilc) {
		int item = sc.nextInt();
		Node node = new Node();
		node.val = item;
		node.left = null;
		node.right = null;

		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = CreateBinaryTree(node, true);
		}

		boolean hrc = sc.nextBoolean();

		if (hrc) {
			node.right = CreateBinaryTree(node, false);
		}
		return node;
	}

	public void add_one_row_to_tree(int v, int d) {
		this.root = add_one_row_to_tree(this.root, v, d);

	}

	private Node add_one_row_to_tree(Node root, int v, int d) {
		if (d == 1) {
			Node new_root = new Node();
			new_root.val = v;
			new_root.left = root;
			return new_root;
		}
		add(root, 1, v, d);
		return root;
	}

	public void add(Node node, int depth, int v, int d) {
		if (node == null) {
			return;
		}

		if (depth == d - 1) {
			Node new_left = new Node();
			new_left.val = v;

			Node new_right = new Node();
			new_right.val = v;

			new_left.left = node.left;
			new_right.right = node.right;

			node.left = new_left;
			node.right = new_right;
			return;

		} else {
			add(node.left, depth + 1, v, d);
			add(node.right, depth + 1, v, d);
		}
	}

	public void display() {
		display(this.root);
	}

	public void display(Node node) {
		if (node == null)
			return;
		String str = " <- " + node.val + " -> ";
		if (node.left != null) {
			str = node.left.val + str;
		}
		if (node.right != null) {
			str = str + node.right.val;
		}
		System.out.println(str);
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeNode t = new TreeNode();
		int v = sc.nextInt();
		int d = sc.nextInt();

		t.add_one_row_to_tree(v, d);
		t.display();
	}

}