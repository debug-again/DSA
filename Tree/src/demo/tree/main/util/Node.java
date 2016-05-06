package demo.tree.main.util;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public int data(){
		return data;
	}
	
	public Node left(){
		return left;
	}
	
	public Node right(){
		return right;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	
	public void setChild(Node left, Node right){
		this.right = right;
		this.left = left;
	}
	
	@Override
	public String toString() {
		return String.valueOf(data);
	}
}
