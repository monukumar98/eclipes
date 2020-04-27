package CodingBlocks;

import java.util.*;
import java.util.LinkedList;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = CreateBinaryTree(null, false);
		// this.root=construct(null, false);
	}

	public BinaryTree(int pre[], int in[]) {
		this.root = CreateTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node CreateTree(int pre[], int plo, int phi, int in[], int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}
		Node node = new Node();
		node.data = pre[plo];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;
		node.left = CreateTree(pre, plo+1, plo + nel, in, ilo, si);
		node.right = CreateTree(pre, plo + nel + 1, phi, in, si + 1, ihi);
		return node;

	}

	private Node CreateBinaryTree(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter root node data");
		} else {
			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}

		}
		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		node.left = null;
		node.right = null;
		System.out.println(node.data + " has left child ?");
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = CreateBinaryTree(node, true);
		}
		System.out.println(node.data + " has right child ?");
		boolean hrc = sc.nextBoolean();

		if (hrc) {
			node.right = CreateBinaryTree(node, false);
		}
		return node;
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

	public int max() {
		return max(this.root);
	}

	private int max(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;

		}

		int left = max(root.left);
		int right = max(root.right);
		return Math.max(root.data, Math.max(left, right));

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

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);
		return lf || rf;
	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		postOrder(node.left);
//		System.out.print(node.data + " ");
		postOrder(node.right);

	}

	public void preOrder() {
		preOrder(this.root);

	}

	private void preOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);

		preOrder(node.right);

	}

	public void inOrder() {
		inOrder(this.root);
	}

	private void inOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);

	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();

		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				queue.addLast(rv.left);
			}
			if (rv.right != null) {
				queue.addLast(rv.right);

			}

		}
		System.out.println();
	}

	public boolean isBalanced() {
		return isBalanced(this.root);
	}

	private boolean isBalanced(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return true;
		}
		boolean lb = isBalanced(node.left);
		boolean rb = isBalanced(node.right);
		int lh = ht(node.left);
		int rh = ht(node.right);
		int dh = lh - rh;
		if ((dh == -1 || dh == 0 || dh == 1) && lb && rb) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 50, 70, 30, 60 };
		int[] post = { 40, 70, 50, 20, 60, 30, 10 };
		int[] in = { 40, 20, 50, 70, 10, 30, 60 };
		BinaryTree bt = new BinaryTree(pre, in);
		bt.display();
//		System.out.println(bt.max());
//		System.out.println(bt.ht());
//		System.out.println(bt.find(85));
//		bt.postOrder();
//		System.out.println();
//		bt.preOrder();
//		System.out.println();
//		bt.inOrder();
//		System.out.println();
//		bt.levelOrder();
//		System.out.println(bt.isBalanced());

	}
}
