package demo.ds.graph.main;

import java.util.LinkedList;

public class Graph {

	protected boolean[] visited;
	protected int n;
	protected LinkedList<Integer> adj[];

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		visited = new boolean[n];
		this.n = n;
		adj = new LinkedList[n];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int from, int to){
		adj[from].add(to);
	}
	
}
