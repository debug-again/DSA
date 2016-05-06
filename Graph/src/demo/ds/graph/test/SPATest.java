package demo.ds.graph.test;

import demo.ds.graph.main.ShortestPathAlgorithm;

	public class SPATest {
		public static void main(String[] args) {
			
			 int graph[][] = {	
		  				{0, 1, 5, 4, 0},
		  				{1, 0, 0, 2, 4},
		  				{5, 0, 0, 1, 0},
		  				{4, 2, 1, 0, 1},
		  				{0, 4, 0, 1, 0},
					};
			 
			 Integer from = 0;
			 Integer des = 4;
			 
			 
			 RunWithTimeTrace.run(ShortestPathAlgorithm.class, "show", graph, from, des);
			
		}
	}
