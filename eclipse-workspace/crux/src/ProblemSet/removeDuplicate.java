package ProblemSet;

import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
		System.out.println(findDuplicates(nums));
	}

	public static ArrayList<Integer> findDuplicates(int[] nums) {
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = Math.abs(nums[i]);

			if (nums[temp - 1] > 0) {

				nums[temp - 1] *= -1;

			} else
				ans.add(temp);
		}
		return ans;
	}
}