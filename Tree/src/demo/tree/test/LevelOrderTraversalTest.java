package demo.tree.test;

import demo.tree.main.LevelOrderTraversal;
import demo.tree.main.util.Node;
import demo.tree.main.util.TreeUtil;

public class LevelOrderTraversalTest {
	public static void main(String[] args) {
		
		Integer[] arr = {20,8,22,4,12,13,14,null,null,10,14};
		TreeUtil tu = new TreeUtil();
		Node root = tu.construct(arr);
		new LevelOrderTraversal().iterate(root, 10);
		
	}
}
