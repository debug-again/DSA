package demo.tree.main.util;

import java.util.Stack;

public class TreeUtil {
	
	static Stack<Node> stack = new Stack<>();
	
	public static Node getNode(Integer data){
		if(data== null)
			return null;
		
		return new Node(data);
	}
	
	public void display(Node root){
		if(root == null){
			System.out.print(root + " ");
		}else{
			System.out.print(root.data() + " ");
			display(root.left());
			display(root.right());
		}
	}
	
	private static int left(int i){
		return 2*i + 1;
	}
	private static int right(int i){
		return left(i) + 1;
	}
	
	public static Node construct(Integer... array){
		Node root = getNode(array[0]);
		stack.push(root);
		construct(array, 0);
		return root;
	}
	
	private static  void construct(Integer[] array, int rooti){
		
		while(!stack.isEmpty()){
			Node r = stack.pop();
			if(r != null){
				
				int li = left(rooti);
				int ri = right(rooti);
				
				if(ri < array.length){
					Integer lv = array[li];
					Integer rv = array[ri];
	
					Node ln = getNode(lv);
					Node rn = getNode(rv);
					
					r.setChild(ln, rn);
					
					stack.push(ln);
					construct(array, li);
					
					stack.push(rn);
					construct(array, ri);
				}
			}
		}
	}
}
