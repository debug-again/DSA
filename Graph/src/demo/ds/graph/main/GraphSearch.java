package demo.ds.graph.main;

import java.util.Iterator;

public class GraphSearch extends Graph {

	public GraphSearch(int n) {
		super(n);
	}

	public void dfs() {
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfsUtil(i);
				System.out.println();
			}
		}
	}

	private void dfsUtil(int i) {
		visited[i] = true;
		System.out.print(i + " ");

		Iterator<Integer> it = adj[i].listIterator();
		while (it.hasNext()) {
			int val = it.next();
			if (!visited[val])
				dfsUtil(val);
		}
	}
}
