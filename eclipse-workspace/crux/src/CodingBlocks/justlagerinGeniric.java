package CodingBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class justlagerinGeniric {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		justlagerinGeniric m = new justlagerinGeniric();
		GenericTree gt = m.new GenericTree();
		//int data = scn.nextInt();
		gt.findSecondLargest();
	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(scn, null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public void findJustLarger(int data) {
			HeapMover hm = new HeapMover();
			this.findJustLarger(this.root, hm, data);

			System.out.println(hm.justLarger == null ? "-1" : hm.justLarger.data);
		}

		private void findJustLarger(Node node, HeapMover rb, int data) {

			// write your code here
			if (node == null) {
				return;
			}
			if (node.data > data) {
				if (rb.justLarger == null) {
					rb.justLarger = node;
				} else {
					if (rb.justLarger.data > node.data) {
						rb.justLarger = node;
					}
				}
			}
			for (Node child : node.children) {
				findJustLarger(child, rb, data);
			}
			// System.out.println(rb.justLarger.data);

		}

		private class HeapMover {

			// write your code here
			Node justLarger = null;
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

		public void findSecondLargest() {

			// write your code here
			HeapMover rb = new HeapMover();
			findSecondLargest(this.root, rb, max());
			System.out.println(rb.justLarger == null ? "-1" : rb.justLarger.data);
		}

		private void findSecondLargest(Node node, HeapMover rb, int data) {

			// write your code here
			if (node == null) {
				return;
			}
			if (node.data < data) {
				if (rb.justLarger == null) {
					rb.justLarger = node;
				} else {
					if (node.data > rb.justLarger.data) {
						rb.justLarger = node;
					}
				}
			}
			for (Node child : node.children) {
				findSecondLargest(child, rb, data);
			}
		}

	}

}