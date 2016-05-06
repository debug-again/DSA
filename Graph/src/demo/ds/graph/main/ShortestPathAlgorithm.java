package demo.ds.graph.main;

import java.util.Arrays;

public class ShortestPathAlgorithm {
	
	public void show(int[][] graph, Integer from, Integer des){
		
		int v = graph.length;
		int[] sum = new int[v];
		int[] parent = new int[v];
		boolean[] inc = new boolean[v];
		
		Arrays.fill(sum, Integer.MAX_VALUE);
		
		sum[from] = 0;
		parent[from] = -1;
		
		findSPA(graph, sum, parent, inc, v);
		
		display(graph, parent, des);
		System.out.println("Total Sum of Path : " + sum[des]);
	}

	private void display(int[][] graph, int[] parent, int des) {
		
		if(parent[des] == -1)
			return;
		
		display(graph, parent, parent[des]);
		System.out.println(parent[des] + " --> " + des + " : " + graph[parent[des]][des]);
		
	}

	private void findSPA(int[][] graph, int[] sum, int[] parent, boolean[] inc, int v) {

		for(int c=0; c< v-1; c++){
			int x = findShortestIndex(graph, inc, sum, v);
			inc[x] = true;
			
			for(int i=0; i< v; i++){
				if(
					!inc[i] &&
					graph[x][i] > 0  &&
					sum[i] > sum[x] + graph[x][i]
				){
					
					sum[i] = sum[x] + graph[x][i];
					parent[i] = x;
				}
				
			}
		}
	}

	private int findShortestIndex(int[][] graph, boolean[] inc, int[] sum, int v) {
		
		int min = Integer.MAX_VALUE, index = -1;
		
		for(int i=0; i< v; i++){
			if(sum[i] < min && !inc[i]){
				min = sum[i];
				index = i;
			}
		}

		return index;
	}

}
