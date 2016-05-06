package demo.ds.graph.test;

import demo.ds.graph.main.GraphSearch;

public class GraphSearchTest {
	public static void main(String[] args) {
		
		GraphSearch graph = new GraphSearch(7);
		graph.addEdge(0, 3);
		graph.addEdge(3, 2);
		graph.addEdge(1, 2);
		graph.addEdge(1, 0);
		graph.addEdge(3, 4);
		graph.addEdge(5, 6);
		graph.dfs();
		
		
	}
}
