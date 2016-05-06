package demo.tree.main;

import java.util.Stack;

import demo.tree.main.util.Node;
import demo.tree.main.util.TreeUtil;

public class TreeTraversal {

	public void inorder(Node root) {

		Stack<Node> stack = new Stack<>();
		if (root == null)
			return;

		do {

			while (root != null) {
				stack.push(root);
				root = root.left();
			}
			
			root = stack.pop();
			visit(root);
			
			if(root.right() != null)
				root = root.right();
			else
				root = null;
			
		} while (stack.size() > 0 || root != null);

	}

	public void preorder(Node root){
		
		Stack<Node> stack = new Stack<>();
		
		if(root == null)
			return;
		
		stack.push(root);
		while(!stack.isEmpty()){
			
			root = stack.pop();
			
			while(root != null){
				
				System.out.print(root+" ");
				
				if(root.right() != null)
					stack.push(root.right());
				
				root = root.left();
			}
			
		}
		
	}
	
	private void visit(Node top) {
		System.out.print(top + " ");
	}

	public static void main(String[] args) {
		
		Node root = TreeUtil.construct(1,2,3,4,5,6,7);
		new TreeTraversal().preorder(root);
	}
}
