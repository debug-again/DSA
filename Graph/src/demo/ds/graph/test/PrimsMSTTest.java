package demo.ds.graph.test;

import demo.ds.graph.main.PrimsMST;

public class PrimsMSTTest {
	public static void main(String[] args) {
		
		  int graph[][] = {	
				  				{0, 2, 0, 6, 0},
				  				{2, 0, 3, 8, 5},
				  				{0, 3, 0, 0, 7},
				  				{6, 8, 0, 0, 9},
				  				{0, 5, 7, 9, 0},
		  					};
		  
		long s = System.currentTimeMillis();
		new PrimsMST().show(graph);
		long t = System.currentTimeMillis();
		System.out.println("Time Taken : " + (t - s));		  
		  
		
	}
}
