package CodingBlocks;

import java.util.*;
public class numberofsubarray {
    public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int k = s.nextInt() ;   
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
			nums[i] = s.nextInt();
		
        System.out.println(subarraySum(nums , k));
        
         }
    public  static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        		int sum = 0;
		int ans =0;
		HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);
		for(int i = 0 ; i < n ;i++) {
			sum+= nums[i];
			if(map.containsKey(sum - k)) {
				ans+=map.get(sum-k);
                
			}
            if(map.containsKey(sum))
			map.put(sum , map.get(sum)+1);
            else
			map.put(sum ,1);
                
		}
		return ans;
    }
}