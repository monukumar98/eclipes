package ProblemSet;

import java.util.Scanner;

public class PrintallleafNode {
	static Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public PrintallleafNode() {
		this.root = createTree(null);

	}

	private Node createTree(Node parent) {
		if (parent == null) {
			Node nn = new Node();
			int item = sc.nextInt();
			nn.data = item;
			nn.left = null;
			nn.right = null;
			parent = nn;

		}
		else {
			
		}

		return parent;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data + "<--";
		} else {
			str += "." + "<--";
		}
		str += node.data + "-->";
		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public static void main(String[] args) {
		PrintallleafNode pl = new PrintallleafNode();
		pl.display();
	}
}
