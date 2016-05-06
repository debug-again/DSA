package demo.ds.graph.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KruskalMST {

	private class Edge{
		Integer src, des, weight;

		public Edge(Integer src, Integer des, Integer weight) {
			this.src = src;
			this.des = des;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return src + " --> " + des + " : " + weight;
		}
	}
	
	private Edge[] edges;
	private int[] parent;
	private int size=0;
	private Integer strength = 0;
	
	public KruskalMST(int e, int v){
		edges = new Edge[e];
		parent = new int[v];
		Arrays.fill(parent, -1);
	}
	
	public void addEdge(int src, int des, int weight){
		Edge e = new Edge(src, des, weight);
		edges[size++] = e;
	}
	
	private void sort(){
		sortUtil(0, edges.length-1);
	}

	private void sortUtil(int low, int high) {

		if (high > low) {

			int mid = (low + high) / 2;
			sortUtil(low, mid);
			sortUtil(mid + 1, high);
			merge(low, mid, high);
		}

	}
	
	private void displayAllEdges(Edge[] array){
		for(Edge e : array)
		{
			System.out.println(e);
			strength += e.weight;
		}
		
		System.out.println("Total Weight of MST : " + strength);
	}
	
	private void merge(int low, int mid, int high) {
		int i=low;
		int j= mid;
		int y=mid+1;
		int z=high;
		Edge[] tempEdges = new Edge[high-low+1]; 
		int k=0;
		
		while(i <= j && y <= z){
			
			if(edges[i].weight > edges[y].weight){
				tempEdges[k++] = edges[y++];
			}else{
				tempEdges[k++] = edges[i++];
			}
		}
		
		while(i <= j){
			tempEdges[k++] = edges[i++];
		}
		
		while(y <= z){
			tempEdges[k++] = edges[y++];
		}
		
		for(i=0; i<k;){
			edges[low++] = tempEdges[i++];
		}
		
	}

	private int find(int i){
		
		if(parent[i] == -1)
			return i;
		
		return find(parent[i]);
	}
	
	private boolean union(Edge e){
		int x = find(e.src);
		int y = find(e.des);
		
		if(x == y)
			return true;
		
		parent[x] = y;
		return false;
		
	}
	
	private boolean checkCycle(Edge e){
		return union(e);
	}
	
	public void show(){
		sort();
		List<Edge> list = new ArrayList<>();
		for(Edge e : edges){
			if(!checkCycle(e)){
				list.add(e);
			}
		}
		
		Edge[] res = list.toArray(new Edge[list.size()]);
		displayAllEdges(res);
	}
}
