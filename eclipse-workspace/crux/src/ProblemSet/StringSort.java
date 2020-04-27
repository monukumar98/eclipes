package ProblemSet;

import java.util.*;

import ProblemSet.sortGame.Employee;

public class StringSort {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (compareTo(arr[j], arr[j + 1]) > 0) {
					String a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public static int compareTo(String s1, String s2) {

		int i = 0;

		while (i < s1.length() && i < s2.length()) {

			if (s1.charAt(i) > s2.charAt(i)) {

				return 1;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
			i++;

		}

		if (s1.length() > s2.length()) {
			return -1;
		} else {
			return 1;
		}

	}
}