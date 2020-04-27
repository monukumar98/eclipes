package CodingBlocks;

import java.util.*;

public class MergeLinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		Node() {

		}
	}

	private Node head;
	private Node tail;
	private int size;

	public MergeLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public MergeLinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	// O(1)
	public int size() {
		return this.size;
	}

	// O(1)
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.head.data;
	}

	// O(1)
	public void addFirst(int data) {
		Node node = new Node(data, this.head);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.head = node;
		}

		this.size++;
	}

//	// O(1)
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// O(n)
	public void display() {
		Node node = this.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		// System.out.println("END");
	}

	public void merge1(Node head1, Node head2) {
		this.head = merge(head1, head2);

	}

	private Node merge(Node head1, Node head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		Node node = new Node();
		if (head1.data < head2.data) {
			node = head1;
			node.next = merge(head1.next, head2);
		} else {
			node = head2;
			node.next = merge(head1, head2.next);
		}
		return node;

	}

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int M = scn.nextInt();

		MergeLinkedList list = new MergeLinkedList();

		for (int i = 0; i < N; i++) {
			list.addLast(scn.nextInt());
		}

		MergeLinkedList other = new MergeLinkedList();

		for (int i = 0; i < M; i++) {
			other.addLast(scn.nextInt());
		}

		list.merge1(list.head, other.head);

		list.display();

	}
}