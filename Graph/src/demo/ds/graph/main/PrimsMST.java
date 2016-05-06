package demo.ds.graph.main;

import java.util.Arrays;

public class PrimsMST {
	
	public void show(int[][] graph){
		
		int v = graph.length;	// total vertices
		int[] parent = new int[v];
		
		boolean mst[] = new boolean[v];	// to track included vertices in mst -- by default every element is false
		int[] key = new int[v]; // to store weight of accessible vertices
		Arrays.fill(key, Integer.MAX_VALUE);	// initially assuming all vertices are inaccessible
		
		int first = 0;
		
		key[first] = 0;	// to start from 0
		parent[first] = -1;
		findMST(parent, mst, key, graph);
		display(parent, graph);
	}

	private void display(int[] parent, int[][] graph) {
		
		int tw =0;
		for(int i=1, v=graph.length; i<v;i++){
			tw += graph[parent[i]][i];
			System.out.println(parent[i] + " --> " + i + " : " + graph[parent[i]][i]);
		}
		
		System.out.println("Total Weight : " + tw);
	}

	private void findMST(int[] parent, boolean[] mst, int[] key, int[][] graph) {

		for(int c=0, v= graph.length; c<v-1; c++){
			// get the minimum key value
			int x = getMinKey(key, mst);
			mst[x] = true;
			
			//update the key array with nearby values
			for(int i=1, n = graph.length; i < n ; i++)
				if(
					graph[x][i] != 0	&&	// there exists a link between x and i
					!mst[i] && // not visited
					graph[x][i] < key[i]	// distance to reach i indirectly is more than reaching from x directly 
				){
					key[i] = graph[x][i];
					parent[i] = x;
				}
						
		}
		
	}

	private int getMinKey(int[] key, boolean[] mst) {
		
		int min = Integer.MAX_VALUE, index = -1;
		for(int i=0, n=key.length; i < n; i++)
			if(!mst[i] && min > key[i]){
				min = key[i];
				index = i;
			}
				
		return index;
	}
	
}
