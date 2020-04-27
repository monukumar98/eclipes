package CodingBlocks;

import java.util.PriorityQueue;
import java.util.*;

public class Maximum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		pQueue.add(sc.nextInt());
		pQueue.add(sc.nextInt());
		pQueue.add(sc.nextInt());
		System.out.println(pQueue.poll());

	}

}
