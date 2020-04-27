package CodingBlocks;

import java.util.Scanner;

public class MergeShortLinkedList {
	private class Node {
		Node next;
		int data;
	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	private Node mergeNode(Node n1, Node n2) {
		if (n1 == null) {
			return n2;
		}
		if (n2 == null) {
			return n1;
		}
		Node node = new Node();
		if (n1.data < n2.data) {
			node = n1;
			node.next = mergeNode(n1.next, n2);
		} else {
			node = n2;
			node.next = mergeNode(n1, n2.next);
		}
		return node;
	}

	public void merge() {
		this.head = merge(this.head);

	}

	private Node merge(Node node) {
		if (node == null || node.next==null) {
			return node;
		}
		Node middle = midNode(node);
		Node nextofmiddle = middle.next;
		middle.next = null;
		Node left = merge(node);
		Node right = merge(nextofmiddle);
		Node sortedList = mergeNode(left, right);
		return sortedList;

	}

	public Node midNode(Node node) {
		Node fast = node;
		Node slow = node;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MergeShortLinkedList l = new MergeShortLinkedList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			l.addLast(sc.nextInt());
		}
		l.merge();
		l.display();
	}

}
