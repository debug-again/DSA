package demo.practice.test;

import demo.practice.main.NextGreaterElement;

public class NextGreaterElementTest {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 2, 25 };
		NextGreaterElement nge = new NextGreaterElement(arr);
		int res = nge.of(1);
		System.out.println(res);
	}
}
