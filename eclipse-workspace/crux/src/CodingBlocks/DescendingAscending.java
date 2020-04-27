package CodingBlocks;

import java.util.Scanner;
import java.util.Random;

public class DescendingAscending {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		Random rand = new Random();
		int min = 0;
		int max = 2;
		// System.out.println(1000000);
		// int j= 0;
		// while(j<5){
		// Set<Integer> set = new HashSet<Integer>();
		System.out.println(1000);
		for (int i = 0; i < 1000; i++) {

			System.out.print(rand.nextInt((max - min) + 1) + min + " ");

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
		System.out.println("...............................");
		System.out.println((endTime - startTime) / 1000.0);
	}

}

//public class DescendingAscending {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//     
//        int n = s.nextInt();
//        int[] ar = new int[n];
//        for (int i = 0; i < n; i++) {
//            ar[i] = s.nextInt();
//        }
//        boolean result = check(ar);
//        System.out.println(result);
//    }
//
//    public static boolean check(int[] ar) {
//        int p = 0;
//        for (int i = 0; i < ar.length - 1; i++) {
//            if (ar[i] > ar[i + 1]) {
//                continue;
//            } else {
//                p = i;
//                for (int j = p; j < ar.length - 1; j++) {
//                    if (ar[j + 1] > ar[j])
//                        continue;
//                    else
//                        return false;
//                }
//            }
//        }
//        return true;
//
//    }
//}
