package Competitive;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class BFSShortestPath {

	private class Vertex {
		HashMap<Integer, Integer> nbrs = new HashMap<Integer, Integer>();

	}

	HashMap<Integer, Vertex> vtces;

	public BFSShortestPath() {
		// TODO Auto-generated constructor stub
		vtces = new HashMap<>();
	}

	public void Add_Vertex(int n) {
		for (int i = 1; i <= n; i++) {
			Vertex vt = new Vertex();
			vtces.put(i, vt);
		}
	}

	public void Add_Edge(int v1, int v2) {
		Vertex vnbrs1 = vtces.get(v1);
		Vertex vnbrs2 = vtces.get(v2);
		vnbrs1.nbrs.put(v2, 1);
		vnbrs2.nbrs.put(v1, 1);

	}

	public void display() {

		System.out.println("---------------------");
		for (Integer key : vtces.keySet()) {
			System.out.println(key + "-->" + vtces.get(key).nbrs);
		}
		System.out.println(".......................");
	}

	public void BFT(int s) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		HashMap<Integer, Boolean> pro = new HashMap<>();
	//	System.out.println(vtces.keySet());
		queue.addLast(s);
		boolean f = false;
		for (Integer key : vtces.keySet()) {
			if (pro.containsValue(key)) {
				continue;
			}
			// pro.put(key, true);
			if(key==s && f) {
				continue;
			}
			queue.addLast(key);
			// System.out.println("hey.....");
			while (!queue.isEmpty()) {
				int k = queue.removeFirst();
				if (pro.containsKey(k)) {
					continue;
				}
				if(k==s) {
					f=true;
				}
				pro.put(k, true);
				Vertex vtx = vtces.get(k);
				// System.out.println("hey...........");
				if (vtx.nbrs.size() == 0) {
					System.out.print(-1 + " ");
				} else {
					System.out.print(6 + " ");

					for (Integer k1 : vtx.nbrs.keySet()) {
						queue.addLast(k1);

					}
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSShortestPath f = new BFSShortestPath();
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			f.Add_Vertex(n);

			for (int i = 0; i < m; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				f.Add_Edge(v1, v2);

			}
			int s = sc.nextInt();
			 f.display();
			f.BFT(s);
			System.out.println();

		}

	}

}
