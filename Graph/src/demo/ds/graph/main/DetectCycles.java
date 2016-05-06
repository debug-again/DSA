package demo.ds.graph.main;

import java.util.ListIterator;
import java.util.Stack;

public class DetectCycles extends Graph {
	
	public DetectCycles(int n) {
		super(n);
	}
	
	public boolean checkUtil(Integer ele, Stack<Integer> stack){
		
			if(!isVisited(ele)){
				if(stack.search(ele) != -1){
					return true;
				}
				stack.push(ele);
				ListIterator<Integer> listIterator = adj[ele].listIterator();
				while(listIterator.hasNext()){
					if(checkUtil(listIterator.next(), stack))
						return true;
				}
				visit(ele, stack);
			}
			
		return false;
	}

	private void visit(Integer ele, Stack<Integer> stack) {
		visited[ele]= true;
		stack.pop();
	}
	
	private boolean isVisited(Integer first) {
		return visited[first];
	}

	public boolean check() {
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<n; i++){
			if(!isVisited(i)){
				if(checkUtil(i, stack))
					return true;
			}
		}
		
		return false;
	}
	
	
}
