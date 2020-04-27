package CodingBlocks;

import java.util.*;

public class Hello {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		Random rand = new Random();
		int min = 1;
		int max = 10000000;
		char ch [] [] = new char[4][5];
		// System.out.println(1);
		// int j= 0;
		// while(j<5){
		// Set<Integer> set = new HashSet<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(10000000);
		int i = 0;
		for (; i < 10000000;) {
			int t = rand.nextInt((max - min) + 1) + min;
			if (map.containsKey(t)) {
				continue;
			} else {
				map.put(t, 1);
				System.out.println(t);
				i++;
			}
			System.out.println(i);

			// System.out.println(rand.nextInt((max - min) + 1) + min);

		}
		// System.out.println();
		// j++;
		// }
//		System.out.println("...............................");
//		System.out.println((endTime - startTime) / 1000.0);
//		int arr[] = new int[ set.size()];

//		for (int val : set) {
//			arr[i++] = val;
//
//		}
		// Arrays.sort(arr);
//		System.out.println(arr.length);
//		for (int val : arr)
//			System.out.print(val + " ");
//		//System.out.print(j+1 +" ");	
		long endTime = System.currentTimeMillis();
//			j++;
//		}
		// System.out.println("...............................");
		System.out.println((endTime - startTime) / 1000.0);
	}

}