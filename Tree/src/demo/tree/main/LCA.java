package demo.tree.main;

import demo.tree.main.util.Node;

public class LCA {
	
	public int find(Node root, int v1, int v2){
		
		while(root != null){
			if(root.data() > v1 && root.data() > v2){
				root = root.left();
			}else if(root.data() < v1 && root.data() < v2){
				root = root.right();
			}else{
				break;
			}
		}
		
		return root.data();
	}
}
