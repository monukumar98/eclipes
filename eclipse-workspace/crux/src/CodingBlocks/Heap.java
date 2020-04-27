package CodingBlocks;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int item) {
		data.add(item);
		upheapify((data.size() - 1));

	}

	private void upheapify(int i) {
		int pi = (i - 1) / 2;
		// TODO Auto-generated method stub
		if (data.get(pi) > data.get(i)) {
			swap(pi, i);
			upheapify(pi);
		}

	}

	public void swap(int i, int j) {

		int ith = data.get(i);
		int jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	public void display() {
		System.out.println(data);
	}

	public int delte() {
		swap(0, data.size() - 1);
		int t = data.remove(data.size()-1);
		downheapify(0);
		return t;

	}

	private void downheapify(int pi) {
		int lc = (2 * pi + 1);
		int rc = (2 * pi + 2);
		int min = pi;
		if (lc < data.size() && data.get(lc) < data.get(min)) {
			min = lc;
		}
		if (rc < data.size() && data.get(rc) < data.get(min)) {
			min = rc;
		}
		if (min != pi) {
			swap(pi, min);
			downheapify(min);
		}

	}

	public static void main(String[] args) {
		Heap hp = new Heap();
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(15);
		hp.add(25);
		hp.add(95);
		hp.add(3);
		hp.add(45);
		hp.display();
		System.out.println(hp.delte());
		hp.display();

	}
}
