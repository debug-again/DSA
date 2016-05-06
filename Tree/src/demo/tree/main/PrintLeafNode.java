package demo.tree.main;

import java.util.Stack;
import demo.tree.main.util.Node;
import demo.tree.main.util.TreeUtil;

public class PrintLeafNode {

	private void showStack(Stack<Node> stack, Node temp) {
		stack.stream().forEach((Node n) -> System.out.print(n.data() + " "));
		System.out.println(temp + " ");
	}

	private boolean isLeaf(Node node) {
		return (node != null) && (node.left() == null) && (node.right() == null);
	}

	public void of(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node temp = stack.pop();

			while (temp != null) {
				stack.push(temp);
				temp = temp.left();
			}

			temp = stack.pop();
			
			if (isLeaf(temp))
				showStack(stack, temp);

			if(temp.right() != null)
				stack.push(temp);
			
			temp = temp.right();
			stack.push(temp);
		}
	}

	public static void main(String[] args) {
		Node root = TreeUtil.construct(0, 1, 2, 3, 4, 5, 6);
		new PrintLeafNode().of(root);
	}

}
