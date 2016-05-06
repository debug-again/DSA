package demo.ds.graph.test;

import demo.ds.graph.main.KruskalMST;

public class KruskalMSTTest {
	public static void main(String[] args) {

		KruskalMST mst = new KruskalMST(7,5);
		
		mst.addEdge(0, 1, 2);
		mst.addEdge(0, 3, 6);
		mst.addEdge(1, 2, 3);
		mst.addEdge(1, 3, 8);
		mst.addEdge(1, 4, 5);
		mst.addEdge(2, 4, 7);
		mst.addEdge(3, 4, 9);
		
		long s = System.currentTimeMillis();
		mst.show();
		long t = System.currentTimeMillis();
		System.out.println("Time Taken : " + (t-s));
		
	}
}
