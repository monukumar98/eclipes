package ProblemSet;

import java.util.*;

public class KMostFrequentWord {

	public static List<String> kMostFrequentWords(String[] words, int k) {

		List<String> ans = new ArrayList<>();
		HashMap<String, Integer> m = new HashMap<>();

		for (String w : words)
			m.put(w, m.containsKey(w) ? m.get(w) + 1 : 1);

		PriorityQueue<String> freq[] = new PriorityQueue[words.length];
		for (int i = 0; i < freq.length; i++)
			freq[i] = new PriorityQueue<>();

		for (String w : m.keySet())
			freq[m.get(w) - 1].add(w);

		for (int i = freq.length - 1; i >= 0 && k > 0; i--)
			while (k > 0 && !freq[i].isEmpty()) {
				ans.add(freq[i].remove());
				k--;
			}
		return ans;

	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), k = scn.nextInt();
		String a[] = new String[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.next();
		List<String> ans = kMostFrequentWords(a, k);
		for (String w : ans)
			System.out.print(w + " ");
		System.out.println();
	}
}