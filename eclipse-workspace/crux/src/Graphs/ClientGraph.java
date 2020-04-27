package Graphs;

import java.util.HashMap;

public class ClientGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.add_vertex("A");
		g.add_vertex("B");
		g.add_vertex("C");
		g.add_vertex("D");
		g.add_vertex("E");
		g.add_vertex("F");
		g.add_vertex("G");
	//	g.add_vertex("H");
		g.addEdge("A", "B", 10);
		g.addEdge("A", "D", 2);
		g.addEdge("B", "C", 3);
		g.addEdge("C", "D", 5);
		g.addEdge("D", "E", 8);
		g.addEdge("E", "F", 1);
		g.addEdge("E", "G", 9);
		g.addEdge("F", "G", 3);
//		// g.add_vertex("k");
//		g.display();
//		System.out.println(g.Number_Vextex());
//		System.out.println(g.NumberofEdge());
//		System.out.println(g.containsEdge("A", "C"));
//		System.out.println(g.containsEdge("E", "F"));
//		 g.remove_edge("A", "B");
//		g.display();
////		g.remove_vertex("D");
////		g.display();
//	g.remove_edge("E", "D");
//		g.remove_edge("A", "D");
//		System.out.println(g.haspath("A", "C", new HashMap<>()));
//		System.out.println(g.haspath("A", "F", new HashMap<>()));
		g.display();
//		System.out.println(g.BFS("A", "F"));
//		System.out.println(g.DFS("A", "F"));
		g.BFT();
		System.out.println("..............");
		g.DFT();
		System.out.println(g.isCyclic());
		System.out.println(g.isConnected());
		System.out.println(g.get_Connected_Componenet());
	}

}
