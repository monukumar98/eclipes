package CodingBlocks;

public class Queue {
	private int[] data;
	private int front;
	private int size;

	public Queue() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public boolean isFull() {
		return this.size() == this.data.length;
	}

	public void enqueue(int val) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is full");
		}
		int i = (this.front + this.size) % this.data.length;
		this.data[i] = val;
		this.size++;
	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}
		int val = data[front];
		this.front = (this.front + 1) % data.length;
		this.size--;
		return val;
	}

	public int getFront() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int rv = this.data[this.front];
		return rv;

	}

	public void display() {
		for (int i = 0; i < this.size(); i++) {
			int idx = (i + this.front) % this.data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
	}

}
