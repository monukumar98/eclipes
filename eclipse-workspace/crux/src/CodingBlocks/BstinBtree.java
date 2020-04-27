package CodingBlocks;

import java.util.LinkedList;
import java.util.Scanner;

public class BstinBtree {

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	private int size;

	public int size() {
		return this.size;
	}

	public BstinBtree(int pre[], int in[]) {
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
		node.left = CreateTree(pre, plo + 1, plo + nel, in, ilo, si);
		node.right = CreateTree(pre, plo + nel + 1, phi, in, si + 1, ihi);
		return node;

	}

	class Info {
		int sz;
		int max;
		int min;
		int ans;
		boolean isBST;

		Info() {

		}

		Info(int s, int max, int min, int ans, boolean isBST) {
			this.sz = s;
			this.max = max;
			this.min = min;
			this.ans = ans;
			this.isBST = isBST;
		}
	}

	public int largestBSTinBT() {
		return this.largestBSTinBT(this.root).ans;
	}

	private Info largestBSTinBT(Node root) {
		if (root == null) {
			return new Info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
		}
		if (root.left == null && root.right == null) {
			return new Info(1, root.data, root.data, 1, true);
		}

		Info l = largestBSTinBT(root.left);
		Info r = largestBSTinBT(root.right);

		Info ret = new Info();
		ret.sz = (1 + l.sz + r.sz);

		if (l.isBST && r.isBST && l.max < root.data && r.min > root.data) {
			ret.min = Math.min(l.min, Math.min(r.min, root.data));
			ret.max = Math.max(r.max, Math.max(l.max, root.data));
			ret.ans = ret.sz;
			ret.isBST = true;
			return ret;
		}

		ret.ans = Math.max(l.ans, r.ans);
		ret.isBST = false;
		return ret;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] pre = new int[n];
		int[] in = new int[n];
		for (int i = 0; i < n; i++) {
			pre[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			in[i] = scn.nextInt();
		}

		BstinBtree bt = new BstinBtree(pre, in);
		System.out.println(bt.largestBSTinBT());
	}
}