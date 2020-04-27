package CodingBlocks;

import java.util.*;
import java.util.Queue;

public class ImportanceOftime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		LinkedList<Integer> q = new LinkedList<>();
		while (n-- > 0) {
			q.addLast(sc.nextInt());
		}
		int arr[] = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int time = 0;
		int ex_job = 0;
		while (!q.isEmpty()) {
			if (q.getFirst() == arr[ex_job]) {
				time++;
				ex_job++;
				q.removeFirst();
			} else {
				int i = q.removeFirst();
				q.addLast(i);
				time++;
			}

		}
		System.out.println(time);

	}

}
