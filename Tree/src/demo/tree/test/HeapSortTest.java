package demo.tree.test;

import demo.tree.main.HeapSort;

public class HeapSortTest {
	public static void main(String[] args) {
		
		int arr[] = {12, 11, 13, 5, 6, 7, 99};
		int k=7;
		new HeapSort().printKLargest(arr, k);
		//System.out.println(Arrays.toString(arr));
	}
}
