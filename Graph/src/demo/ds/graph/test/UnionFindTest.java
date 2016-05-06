package demo.ds.graph.test;

import demo.ds.graph.main.UnionFind;

public class UnionFindTest {
	public static void main(String[] args) {

		UnionFind uf = new UnionFind(5);
		uf.addEdge(0,1);
		uf.addEdge(1,2);
		uf.addEdge(2,3);
		uf.addEdge(3,4);
		uf.addEdge(4,4);
		
		
		boolean hasCycles = uf.hasCycles();
		System.out.println(hasCycles);
		
	}
}
