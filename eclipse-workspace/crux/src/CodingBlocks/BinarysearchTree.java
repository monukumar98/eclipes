package CodingBlocks;

public class BinarysearchTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinarysearchTree(int in[]) {
		this.root = createNode(in, 0, in.length - 1);

	}

	private Node createNode(int[] in, int i, int j) {
		if (i > j)
			return null;
		int mid = (i + j) / 2;
		Node node = new Node();
		node.data = in[mid];
		node.left = createNode(in, i, mid - 1);
		node.right = createNode(in, mid + 1, j);
		return node;
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

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		if (node.data > item) {
			return find(node.left, item);
		} else {
			return find(node.right, item);
		}
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void add(int item) {
		// add(this.root, item);
		this.root = addreturn(this.root, item);
	}

	private Node addreturn(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			Node nn = new Node();
			nn.data = item;
			return node = nn;
		}
		if (item <= node.data) {
			node.left = addreturn(node.left, item);
		} else {
			node.right = addreturn(node.right, item);
		}
		return node;
	}

	private void add(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			Node nn = new Node();
			nn.data = item;
			return;
		}
		if (item < node.data) {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;
				node.left = nn;
			}

			else {
				add(node.left, item);
			}
		} else {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;
			} else {
				add(node.right, item);
			}
		}

	}

	public void remove(int item) {
		remove(this.root, null, item);
	}

	private void remove(Node child, Node parent, int item) {
	
		if (item < child.data) {
			remove(child.left, child, item);
		} else if (item > child.data) {
			remove(child.right, child, item);

		} else {
			// leaf node
			if (child.left == null && child.right == null) {
				if (child.data <= parent.data) {
					parent.left = null;

				} else {
					parent.right = null;
				}
			}
			// one child
			else if (child.left != null && child.right == null) {
				if (child.data <= parent.data) {
					parent.left = child.left;

				} else {
					parent.right = child.left;
				}

			}
			// one child
			else if (child.left == null && child.right != null) {
				if (child.data <= parent.data) {
					parent.left = child.right;

				} else {
					parent.right = child.right;
				}

			} else {
				int temp = max(child.left);
				remove(child.left, child, temp);
				child.data = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70 };
		BinarysearchTree bst = new BinarysearchTree(in);
		bst.add(100);
		bst.add(85);
		bst.display();
		bst.remove(60);
		bst.display();
//		System.out.println(bst.max());
//		System.out.println(bst.find(60));
//		System.out.println(bst.ht());
	}

}
