package ProblemSet;

import java.util.*;

public class Zerosumsubarray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = scn.nextInt();
		//	int arr[] = new int [n];
			a.equals(arr);
			System.out.println(count(a));
		}
	}

	public static int count(int a[]) {
		int pr[] = new int[a.length];
		pr[0] = a[0];
		HashMap<Integer, Integer> m = new HashMap<>();
		HashMap<Integer,Integer> m1 = new HashMap<Integer, Integer>();
		m.put(0, 1);
		if (m.containsKey(a[0]))
			m.put(a[0], 2);
		else
			m.put(a[0], 1);
		for (int i = 1; i < a.length; i++) {
			pr[i] = pr[i - 1] + a[i];
			if (m.containsKey(pr[i]))
				m.put(pr[i], m.get(pr[i]) + 1);
			else
				m.put(pr[i], 1);
		}
		int c = 0;
		for (int i : m.keySet()) {
			int n = m.get(i);
			if (n > 1)
				c += n * (n - 1) / 2;
		}

		return c;
	}
}
