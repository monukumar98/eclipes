package CodingBlocks;

import java.util.*;
import java.util.LinkedList;

public class GenericTree {
	static Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		this.root = construct(null, -1);
	}

	private Node construct(Node parent, int ith) {
		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data);
		}
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		System.out.println("No of children for " + node.data + " ?");
		int noc = sc.nextInt();

		for (int i = 0; i < noc; i++) {
			Node child = construct(node, i);
			node.children.add(child);
		}
		return node;
	}

	public void display() {
		System.out.println("------------------");
		display(this.root);
		System.out.println("------------------");
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String str = "";
		str += node.data + "-->";
		for (Node child : node.children) {
			str += child.data + ", ";
		}
		str += ".";
		System.out.println(str);
		for (int i = 0; i < node.children.size(); i++) {
			display(node.children.get(i));
		}

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		int tm = node.data;
		for (Node child : node.children) {
			int cm = max(child);
			if (cm > tm) {
				tm = cm;
			}
		}
		return tm;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node.data == item) {
			return true;
		}
		if (node.children.size() == 0) {
			return false;
		}
		for (Node Child : node.children) {
			return find(Child, item);

		}
		return false;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		int th = -1;

		for (Node child : node.children) {
			int ch = ht(child);
			if (ch > th) {
				th = ch;
			}

		}
		return th + 1;

	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node root) {
		// TODO Auto-generated method stub
		System.out.print(root.data + " ");
		for (Node child : root.children) {
			preOrder(child);
		}

	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(Node root) {
		// TODO Auto-generated method stub
		for (Node child : root.children) {
			postOrder(child);
		}
		System.out.print(root.data + " ");

	}

	public void printlevelOrder() {
		printlevelOrder(this.root);
	}

	private void printlevelOrder(Node node) {
		// TODO Auto-generated method stub
		LinkedList<Node> list = new LinkedList<>();
		list.addFirst(node);
		while (!list.isEmpty()) {
			Node rv = list.removeFirst();
			System.out.print(rv.data + " ");
			for (Node child : rv.children) {
				list.addLast(child);
			}
		}
		System.out.println();

	}

	public void levelOrderLinewise() {
		levelOrderLinewise(this.root);
	}

	private void levelOrderLinewise(Node root) {
		// TODO Auto-generated method stub
		LinkedList<Node> primary = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		primary.addLast(root);
		while (!primary.isEmpty()) {
			Node rv = primary.removeFirst();
			System.out.print(rv.data+" ");
			for (Node child : rv.children) {
				helper.addLast(child);
			}
			if (primary.isEmpty()) {
				System.out.println();
				primary = helper;
				helper = new LinkedList<>();
			}
		}

	}

	public static void main(String[] args) {
		GenericTree gt = new GenericTree();
		gt.display();
		System.out.println(gt.max());
		System.out.println(gt.find(1100));
		System.out.println(gt.ht());
		gt.preOrder();
		System.out.println();
		gt.postOrder();
		System.out.println();
		gt.printlevelOrder();
		System.out.println();
		gt.levelOrderLinewise();
		// 60 3 41 2 17 0 16 0 15 1 21 0 24 2 30 0 84 0
	}
}
