package ProblemSet;

import java.util.Arrays;
import java.util.Scanner;

public class SortGameDoubts {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sal_cutoff = s.nextInt();
		int n = s.nextInt();
		int[] sal = new int[n];
		String[] name = new String[n];

		for (int i = 0; i < n; i++) {
			name[i] = s.next();
			sal[i] = s.nextInt();
		}
		// String[] name ={"asha","bimla","chinu","tinu","chi","deena"};
		// int[] sal = {50,60,70,70,70,80};
		sortGame(name, sal);
		displayRes(sal_cutoff, name, sal);
	//	System.out.println(Arrays.toString(sal));
	//	System.out.println(Arrays.toString(name));
	}

	public static void sortGame(String[] name, int[] sal) {
		for (int i = 0; i < sal.length; i++) {
			for (int j = 0; j < sal.length - 1; j++) {
				int temp = 0;
				String nm = "";
				if (sal[j] < sal[j + 1]) {
					temp = sal[j];
					nm = name[j];
					sal[j] = sal[j + 1];
					name[j] = name[j + 1];
					sal[j + 1] = temp;
					name[j + 1] = nm;
				}
				if (sal[j] == sal[j + 1]) {
					nameSort(name, sal, i, j);
				}
			}
		}
	}

	public static void nameSort(String[] name, int[] sal, int i, int j) {
		int k = 0;
		int l1 = name[j].length();
		int l2 = name[j + 1].length();
		int min = Math.min(l1, l2);
		compareSort(name, i, j, k, min, l1, l2);
	}

	public static void compareSort(String[] name, int i, int j, int k, int min, int l1, int l2) {
		if (k == min) {
			String nm = "";

			if (l1 < l2) {
				nm = name[j];
				name[j] = name[j + 1];
				name[j + 1] = nm;
			}
			return;
		}

		String nm = "";
		char c1 = name[j].charAt(k);
		char c2 = name[j + 1].charAt(k);
		if ((int) c1 < (int) c2) {
			nm = name[j];
			name[j] = name[j + 1];
			name[j + 1] = nm;
		} else if ((int) c1 == (int) c2) {
			k++;
			compareSort(name, i, j, k, min, l1, l2);
		}
	}

	public static void displayRes(int cutoff, String[] name, int[] sal) {
		for (int i = 0; i < sal.length; i++) {
			if (sal[i] >= cutoff) {
				System.out.println(name[i] + " " + sal[i]);
			}
		}
	}
}