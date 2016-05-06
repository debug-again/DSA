package demo.tree.main;

import java.util.LinkedList;
import java.util.Queue;

import demo.tree.main.util.Node;

public class LevelOrderTraversal {

	public void show(Node root, int level) {

		if (root == null)
			return;

		if (level == 0) {
			System.out.print(root.data() + " ");
		}else if(level > 0){
			show(root.left(), level-1);
			show(root.right(), level-1);
		}
		
	}
	
	public void iterate(Node root, int level){
		
		if(root == null)
			return ;
		
		 Queue<Node> nodes = new LinkedList<>();
		 Queue<Integer> levels = new LinkedList<>();
		 
		 nodes.offer(root);
		 levels.offer(0);
		 
		 while(!nodes.isEmpty()){
			
			int l = levels.poll().intValue();
			
			if(l > level)
				return;
			
			Node r = nodes.poll();
			
			if(r != null)
				if(l == level)
					System.out.print( r.data() + " ");
				else{
					nodes.offer(r.left());
					nodes.offer(r.right());
					levels.offer(l+1);
					levels.offer(l+1);
				}
		 }
	}
}
