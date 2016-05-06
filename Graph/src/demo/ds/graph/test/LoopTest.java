package demo.ds.graph.test;

import demo.ds.graph.main.DetectCycles;

public class LoopTest {
	public static void main(String[] args) {
		
		DetectCycles g = new DetectCycles(7);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 3);
	    g.addEdge(2, 3);
	    g.addEdge(3, 4);
	    g.addEdge(5, 6);
	    
	    boolean res = g.check();
	    System.out.println(res);
	}
}
