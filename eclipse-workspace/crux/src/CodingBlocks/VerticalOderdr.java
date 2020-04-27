package CodingBlocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class VerticalOderdr {
	static ArrayList<Integer> li = new ArrayList<>();
	static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	private class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public VerticalOderdr() {
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

	public void vertiacltravesal() {

		vertiacltravesal(this.root, 0, map);
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);

		for (int val : keys) {
			ArrayList<Integer> a = map.get(val);
			for (int val1 : a) {
				System.out.print(val1 + " ");
			}
			System.out.println();
		}

	}

	public void TopOrder() {
		TopOrder(this.root);
	}

	private void TopOrder(Node node) {
		printleval();
		vertiacltravesal(this.root, 0, map);
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);

		for (int val : keys) {
			ArrayList<Integer> a = map.get(val);
			if (a.size() == 1) {
				System.out.print(a.get(0) + " ");
			} else {
				int min = Integer.MAX_VALUE;
				for (int i = 0; i < a.size(); i++) {
					for (int j = 0; j < li.size(); j++) {
						if (a.get(i) == li.get(j)) {
							min = Math.min(min, j);
						}
					}
				}
				System.out.print(a.get(min) + " ");
			}
		}

	}

	public void printleval() {
		printleval(this.root);

	}

	private void printleval(Node node) {
		// TODO Auto-generated method stub
		LinkedList<Node> Q = new LinkedList<>();

		Q.add(this.root);
		while (!Q.isEmpty()) {
			Node rv = Q.removeFirst();
			li.add(rv.data);
			if (rv.left != null) {
				Q.addLast(rv.left);
			}
			if (rv.right != null) {
				Q.addLast(rv.right);

			}
		}
	//	System.out.println(li);

	}

	private void vertiacltravesal(Node node, int i, HashMap<Integer, ArrayList<Integer>> map) {
		if (node == null) {
			return;
		}
		if (!map.containsKey(i)) {
			map.put(i, new ArrayList<>());

		}
		ArrayList<Integer> a = map.get(i);
		a.add(node.data);
		map.put(i, a);
		vertiacltravesal(node.left, i - 1, map);
		vertiacltravesal(node.right, i + 1, map);

	}

	public static void main(String[] args) {
		VerticalOderdr vl = new VerticalOderdr();
	//	vl.vertiacltravesal();
	//	vl.printleval();
		vl.TopOrder();
	}

}
