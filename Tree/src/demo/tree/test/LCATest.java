package demo.tree.test;

import java.math.BigInteger;

import demo.tree.main.LCA;
import demo.tree.main.util.Node;
import demo.tree.main.util.TreeUtil;

public class LCATest {
	
	public static void main(String[] args) {
		
		TreeUtil tu = new TreeUtil();
		Integer[] arr = {20,8,22,4,12,null,null,null,null,10,14};
		Node root = tu.construct(arr);
		LCA lca = new LCA();
		int val = lca.find(root, -1, -1);
		System.out.println(val);
	}
}
