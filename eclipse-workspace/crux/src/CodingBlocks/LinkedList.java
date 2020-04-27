package CodingBlocks;

public class LinkedList {

	private class Node {
		int data;
		Node next;

	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach
		nn.next = this.head;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			// nn = this.head;
			this.head = nn;
			this.size++;
		}

	}

	public void addLast(int item) {
		if (this.size == 0) {
			addFirst(item);

		}
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach
		this.tail.next = nn;
		this.tail = nn;
		this.size++;

	}

	public void addat(int k, int item) throws Exception {
		if (k < 0 && k >= this.size) {
			throw new Exception("Invalied index");

		}
		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			Node nm1 = GetNode(k - 1);
			nn.next = nm1.next;
			nm1.next = nn;
			this.size++;
		}

	}

	private Node GetNode(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("ll is empty");
		}
		if (k < 0 && k >= this.size) {
			throw new Exception("Invalied index");

		}
		Node temp = this.head;
		int i = 0;
		while (i < k) {
			temp = temp.next;
			i++;
		}
		return temp;

	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}
		return this.head.data;

	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}
		return this.tail.data;

	}

	public int getAt(int i) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}

		return GetNode(i).data;

	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}
		if (this.size == 1) {
			int t = this.head.data;
			this.head = null;
			this.tail = null;
			this.size--;
			return t;
		}
		int t = this.head.data;
		this.head = this.head.next;
		this.size--;
		return t;

	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}
		if (this.size == 1) {
			return removeFirst();
		} else {
			Node temp = GetNode(this.size - 2);
			int t = temp.next.data;
			temp.next = null;
			this.tail = temp;

			this.size--;
			return t;
		}
	}

	public int removeAt(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("ll is empty");
		}
		if (k < 0 && k >= this.size) {
			throw new Exception("Invalied index");

		}
		if (k == 0) {
			return this.removeFirst();

		} else if (k == this.size - 1) {
			return this.removeLast();
		} else {
			Node nm1 = GetNode(k - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size--;
			return n.data;

		}

	}

	public void reversedata() throws Exception {
		int i = 0;
		int j = this.size - 1;
		while (i <= j) {
			Node n1 = GetNode(i);
			Node n2 = GetNode(j);
			int tamp = n1.data;
			n1.data = n2.data;
			n2.data = tamp;
			i++;
			j--;
		}

	}

	public void reversePointer() {
		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		this.tail.next = null;

	}
	public void RPointerRecursively() {
		RPointerRecursively(this.head, this.head.next);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;

	}

	private void RPointerRecursively(Node prev, Node curr) {

		if (curr == null) {
			return;
		}

		
		RPointerRecursively(curr, curr.next);
		curr.next = prev;

	}

	public void RDataRecursively() {
		// RDataRecursively(this.head, this.head, 0);

		HeapMover mover = new HeapMover();
		mover.left = this.head;

		 RDataRecursively(mover, this.head, 0);

	}

	private Node RDataRecursively(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}

		Node cl = RDataRecursively(left, right.next, count + 1);

		if (count >= this.size / 2) {
			int temp = cl.data;
			cl.data = right.data;
			right.data = temp;
		}

		return cl.next;

	}

	private class HeapMover {
		Node left;
	}
	public void midNode() {
		Node fast = this.head;
		Node slow= this.head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
		
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();

	}

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		list.addLast(50);
		// System.out.println(list.GetNode(2));
		list.addat(3, 60);
		list.addat(6, 70);
		list.addat(0, 80);
		list.addat(3, 90);
		list.display();
		System.out.println(list.getFirst());
		System.out.println(list.getlast());
		System.out.println(list.getAt(2));
		System.out.println(list.removeFirst());
		list.display();
		System.out.println(list.removeLast());
		list.display();
	//	 System.out.println(list.removeAt(1));
		// list.display();
		// list.reversedata();
//		list.reversePointer();
		list.display();
		list.midNode();
	}

}
