package ProblemSet;

/* Swap nodes in Pair */
public class Swap_Node_in_apir {
	public static void main(String[] args) {
		ListNode head = make();
		display(head);
		head = Swap_nodes(head);
		display(head);
	}

	public static ListNode Swap_nodes(ListNode node) {
		if (node == null || node.next == null) // Base Case
			return node;

		ListNode swap = Swap_nodes(node.next.next);

		ListNode another = node.next;
		another.next = node;
		node.next = swap;

		return another;

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode make() {
		int n = 5;
		ListNode head = new ListNode(1);
		ListNode prev = head;
		for (int i = 2; i <= 5; i++) {
			ListNode nn = new ListNode(i);
			prev.next = nn;
			prev = nn;
		}
		return head;
	}

	public static void display(ListNode root) {
		if (root == null) {
			System.out.println();
			return;
		}
		System.out.print(root.val + " -> ");
		display(root.next);
	}

}
