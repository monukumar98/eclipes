package CodingBlocks;

import java.util.Scanner;


import java.util.LinkedList;;

public class BinaryTreeLevel {
	static Scanner sc = new Scanner(System.in);
	static int max_leval = 0;

	private class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public BinaryTreeLevel() {
		// TODO Auto-generated constructor stub
		this.root = createNode();
	}

	private Node createNode() {
		int d = sc.nextInt();
		LinkedList<Node> q = new LinkedList();
		Node nn = new Node();
		nn.data = d;
		this.root = nn;
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.getFirst();
			q.removeFirst();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				nn = new Node();
				nn.data = c1;
				node.left = nn;
				q.addLast(node.left);
			}

			if (c2 != -1) {
				nn = new Node();
				nn.data = c2;
				node.right = nn;
				q.addLast(node.right);

			}

		}
		return root;

	}
	public int ht() {
		return ht(this.root);
	}

	private int ht(Node root) {
		if (root == null) {
			return -1;
		}
		int lh = ht(root.left);
		int rh = ht(root.right);
		return Math.max(lh, rh) + 1;

		// return 0;
	}
	public void leftview() {
		leftview(this.root, 1);
	}

	private void leftview(Node node, int l) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		if (max_leval < l) {
			System.out.print(node.data + " ");
			max_leval = l;
		}
		leftview(node.left, l + 1);

		leftview(node.right, l + 1);

	}

	public void display() {
		System.out.println("---------------");
		display(this.root);
		System.out.println("---------------");
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<--";
		str += node.data + "-->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeLevel bl = new BinaryTreeLevel();
	//	bl.leftview();
		bl.display();

	}

}
