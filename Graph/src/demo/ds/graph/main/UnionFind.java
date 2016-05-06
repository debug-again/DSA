package demo.ds.graph.main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UnionFind {

	private class Edge{
		Integer src, dest;
	}
	
	List<Edge> edges ;
	Integer[] parent;
	
	public UnionFind(int n) {
		edges = new LinkedList<>();
		parent = new Integer[n];
		
		Arrays.fill(parent, -1);
	}
	
	private Integer find(Integer ele){
		
		if(parent[ele] == -1)
			return ele;

		return find(parent[ele]);
	}
	
	private boolean union(Edge e){
		
		Integer x = find(e.src);
		Integer y = find(e.dest);
		
		if(x == y){
			return true;
		}
		
		parent[x] = y;
		return false;
	}
	
	public boolean hasCycles(){
		
		for(Edge e : edges)
			if(union(e))
				return true;
		
		return false;
	}
	
	public void addEdge(Integer src, Integer des){
		Edge e = new Edge();
		e.src = src;
		e.dest = des;
		
		edges.add(e);
	}
	
	
	
	
}
