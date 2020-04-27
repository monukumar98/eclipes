package ProblemSet;

import java.util.*;

public class KMostFrequentElements {

	public static List<Integer> kMostFrequent(int[] a, int k) {

		List<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> m = new HashMap<>();

		for (int i : a) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else
				m.put(i, 1);
		}

		List<Integer> freq[] = new ArrayList[a.length];
		for (int i = 0; i < freq.length; i++)
			freq[i] = new ArrayList<>();

		for (int key : m.keySet())
			freq[m.get(key) - 1].add(key);

		for (int i = freq.length - 1; i >= 0 && k > 0; i--)
			while (freq[i].size() != 0 && k > 0) {
				k--;
				ans.add(freq[i].remove(0));
			}

		return ans;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), k = scn.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();
		List<Integer> ans = kMostFrequent(a, k);
		for (int i : ans)
			System.out.print(i + " ");
		System.out.println();
	}
}