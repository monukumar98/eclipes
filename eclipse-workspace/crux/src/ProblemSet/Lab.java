package ProblemSet;

import java.util.*;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int D = sc.nextInt();
		PriorityQueue<Integer> di = new PriorityQueue<Integer>();
		int ti[] = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int si[] = new int[n];
		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			ti[i] = b;
			si[i] = c;
			di.add(a);
			map.put(a, i);

		}
		int d = 0;
		int m = di.peek();
		for (int i = 0; i < n && d <= D; i++) {
			int t = di.poll();
			if (i >= 1 && m + 1 != t) {
				D = t - 1;
			}
			
			m = t;
			int j = map.get(t);
			if (d + ti[j] <= D) {
				si[j] = 0;
				d += ti[j];
			} else {
				int k = D - d;
				D += d + k;
				si[j] = ti[j] * si[j] - k * si[j];
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += si[i];
		}
		System.out.println(ans);

	}

}
