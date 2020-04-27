package CodingBlocks;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class TopView {
	static Scanner sc = new Scanner(System.in);
	private class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public TopView() {
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
	public void topviewtree() {
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
	}

}
