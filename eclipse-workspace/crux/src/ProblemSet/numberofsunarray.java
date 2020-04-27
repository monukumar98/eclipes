package ProblemSet;

import java.util.*;

public class numberofsunarray {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
	//	System.out.println((long) (Math.pow(2, 100000)-1));
		int n = s.nextInt();
        int k = s.nextInt() ;   
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
			nums[i] = s.nextInt();
		
        System.out.println(subarraySum(nums , k));

	}

	public static long subarraySum(int[] nums, int k) {
		int n = nums.length;
		long sum = 0;
		long ans = 0;
		HashMap<Long, Long> map = new HashMap<>();
		map.put((long) 0, (long) 1);
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				ans += map.get(sum - k);

			}
			if (map.containsKey(sum))
				map.put(sum, map.get(sum) + 1);
			else
				map.put(sum, (long) 1);

		}
		return ans;
	}
}