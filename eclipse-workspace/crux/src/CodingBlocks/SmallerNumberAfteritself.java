package CodingBlocks;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SmallerNumberAfteritself {

	static class Pair {
		int data, i;

		Pair(int d, int i) {
			data = d;
			this.i = i;
		}
	}

	static int ans[];

	public static List<Integer> countSmaller(int[] nums) {

		Pair a[] = new Pair[nums.length];
		for (int i = 0; i < nums.length; i++)
			a[i] = new Pair(nums[i], i);

		ans = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].data + " " + a[i].i + " ");
		}
		System.out.println();
		System.out.println("......................");
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].data + " " + a[i].i + " ");
		}
		System.out.println();
		System.out.println("..................................");
		List<Integer> x = new ArrayList<>();
		for (int i : ans)
			x.add(i);
		return x;
	}

	public static void mergeSort(Pair a[], int start, int end) {
		if (start >= end)
			return;
		int m = (start + end) / 2;
		mergeSort(a, start, m);
		mergeSort(a, m + 1, end);
		merge(a, start, m, end);
	}

	public static void merge(Pair a[], int start, int mid, int end) {
		Pair f[] = new Pair[mid - start + 1];
		Pair s[] = new Pair[end - mid];

		for (int i = start; i <= mid; i++)
			f[i - start] = a[i];
		for (int i = mid + 1; i <= end; i++)
			s[i - mid - 1] = a[i];

		int i = 0, j = 0, k = start;
		int count = 0;
		while (i < f.length && j < s.length) {
			if (f[i].data <= s[j].data) {
				ans[f[i].i] += count;
				a[k++] = f[i++];
			} else {
				count++;
				a[k++] = s[j++];
			}
		}

		while (i < f.length) {
			ans[f[i].i] += count;
			a[k++] = f[i++];
		}
		while (j < s.length)
			a[k++] = s[j++];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();
		List<Integer> c = countSmaller(a);
		for (int i : c)
			System.out.print(i + " ");
	}
}