package Graphs;

import java.util.*;

public class Graph {
	private class vertex {
		HashMap<String, Integer> nebrs = new HashMap<>();
	}

	HashMap<String, vertex> vtces;

	public Graph() {
		// TODO Auto-generated constructor stub
		vtces = new HashMap<>();
	}

	public int Number_Vextex() {
		return this.vtces.size();

	}

	public boolean Contains_Vextex(String vname) {
		return this.vtces.containsKey(vname);

	}

	public void add_vertex(String vname) {
		vertex vtx = new vertex();
		vtces.put(vname, vtx);

	}

	public void remove_vertex(String vname) {
		vertex vtx = vtces.get(vname);
		for (String key : vtx.nebrs.keySet()) {
			vertex nebrsvtx = vtces.get(key);
			nebrsvtx.nebrs.remove(vname);
		}
		vtces.remove(vname);

	}

	public int NumberofEdge() {
		int sum = 0;
		for (String key : vtces.keySet()) {
			sum += vtces.get(key).nebrs.size();
		}
		return sum / 2;

	}

	public boolean containsEdge(String vname1, String vname2) {
		vertex v1 = vtces.get(vname1);
		vertex v2 = vtces.get(vname2);
		if (v1 == null || v2 == null || !v1.nebrs.containsKey(vname2)) {
			return false;
		}
		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {
		vertex v1 = vtces.get(vname1);
		vertex v2 = vtces.get(vname2);
		if (v1 == null || v2 == null || v1.nebrs.containsKey(vname2)) {
			return;
		}
		v1.nebrs.put(vname2, cost);
		v2.nebrs.put(vname1, cost);

	}

	public void remove_edge(String vname1, String vname2) {
		vertex v1 = vtces.get(vname1);
		vertex v2 = vtces.get(vname2);
		if (v1 == null || v2 == null || !v1.nebrs.containsKey(vname2)) {
			return;
		}
		v1.nebrs.remove(vname2);
		v2.nebrs.remove(vname1);
	}

	public void display() {

		System.out.println("---------------------");
		for (String key : vtces.keySet()) {
			System.out.println(key + "-->" + vtces.get(key).nebrs);
		}
		System.out.println(".......................");
	}

	public boolean haspath(String vname1, String vname2, HashMap<String, Boolean> pro) {
		if (containsEdge(vname1, vname2)) {
			return true;
		}

		vertex vtx = vtces.get(vname1);
		if (vtx == null) {
			return false;
		}
		for (String key : vtx.nebrs.keySet()) {
			if (!pro.containsKey(key)) {
				pro.put(key, true);
				if (haspath(key, vname2, pro)) {
					return true;
				}
			}
		}
		return false;

	}

	private class Pair {
		String vname;
		String psf;
	}

	public boolean BFS(String src, String dst) {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		queue.addLast(sp);
		while (!queue.isEmpty()) {
			Pair rp = queue.removeFirst();
			if (pro.containsKey(rp.vname)) {
				continue;
			}
			pro.put(rp.vname, true);
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			// nbrs
			vertex vtx = vtces.get(rp.vname);
			for (String key : vtx.nebrs.keySet()) {
				if (!pro.containsKey(key)) {
					Pair np = new Pair();
					np.vname = key;
					np.psf = rp.psf + key;
					queue.add(np);
				}
			}
		}
		return false;
	}

	public boolean DFS(String src, String dst) {
		LinkedList<Pair> stack = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		stack.addFirst(sp);
		while (!stack.isEmpty()) {
			Pair rp = stack.removeFirst();
			if (pro.containsKey(rp.vname)) {
				continue;
			}
			pro.put(rp.vname, true);
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			// nbrs
			vertex vtx = vtces.get(rp.vname);
			for (String key : vtx.nebrs.keySet()) {
				if (!pro.containsKey(key)) {
					Pair np = new Pair();
					np.vname = key;
					np.psf = rp.psf + key;
					stack.addFirst(np);
				}
			}
		}
		return false;
	}

	public void BFT() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		for (String src : vtces.keySet()) {
			if (pro.containsKey(src)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = src;
			sp.psf = src;
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();
				if (pro.containsKey(rp.vname)) {
					continue;
				}
				pro.put(rp.vname, true);
				System.out.println(rp.vname + " via " + rp.psf);
				// nbrs
				vertex vtx = vtces.get(rp.vname);
				for (String key : vtx.nebrs.keySet()) {
					if (!pro.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.add(np);
					}
				}
			}
		}
		return;
	}

	public void DFT() {
		LinkedList<Pair> stack = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		for (String src : vtces.keySet()) {
			if (pro.containsKey(src)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = src;
			sp.psf = src;
			stack.addFirst(sp);
			while (!stack.isEmpty()) {
				Pair rp = stack.removeFirst();
				if (pro.containsKey(rp.vname)) {
					continue;
				}
				pro.put(rp.vname, true);
				System.out.println(rp.vname + " via " + rp.psf);
				// nbrs
				vertex vtx = vtces.get(rp.vname);
				for (String key : vtx.nebrs.keySet()) {
					if (!pro.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						stack.addFirst(np);
					}
				}
			}
		}
		return;
	}

	public boolean isCyclic() {
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		for (String src : vtces.keySet()) {
			if (pro.containsKey(src)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = src;
			sp.psf = src;
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();
				if (pro.containsKey(rp.vname)) {
					return true;
				}
				pro.put(rp.vname, true);
				System.out.println(rp.vname + " via " + rp.psf);
				// nbrs
				vertex vtx = vtces.get(rp.vname);
				for (String key : vtx.nebrs.keySet()) {
					if (!pro.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.add(np);
					}
				}
			}
		}
		return false;
	}

	public boolean isConnected() {
		int flag = 0;
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		for (String src : vtces.keySet()) {
			if (pro.containsKey(src)) {
				continue;
			}
			flag++;
			Pair sp = new Pair();
			sp.vname = src;
			sp.psf = src;
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();
				if (pro.containsKey(rp.vname)) {
					continue;
				}
				pro.put(rp.vname, true);
				System.out.println(rp.vname + " via " + rp.psf);
				// nbrs
				vertex vtx = vtces.get(rp.vname);
				for (String key : vtx.nebrs.keySet()) {
					if (!pro.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.add(np);
					}
				}
			}
		}
		if (flag >= 2) {
			return false;
		}
		return true;

	}

	public boolean isTree() {
		return !isCyclic() && isConnected();
	}

	public ArrayList<ArrayList<String>> get_Connected_Componenet() {
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> pro = new HashMap<>();
		for (String src : vtces.keySet()) {
			if (pro.containsKey(src)) {
				continue;
			}
			Pair sp = new Pair();
			sp.vname = src;
			sp.psf = src;
			ArrayList<String> l1 = new ArrayList<>();
			// l1.add()
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();
				if (pro.containsKey(rp.vname)) {

					continue;
				}
				pro.put(rp.vname, true);
				// System.out.println(rp.vname + " via " + rp.psf);
				l1.add(rp.vname);
				// nbrs
				vertex vtx = vtces.get(rp.vname);
				for (String key : vtx.nebrs.keySet()) {
					if (!pro.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.add(np);
					}
				}
			}
			list.add(l1);

		}
		return list;

	}
}
