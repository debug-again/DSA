package demo.practice.test;

import demo.practice.main.NumberOccuringOnce;

public class NumberOccuringOnceTest {

	public static void main(String[] args) {
		 int[] arr = { 0,0,1,2,2,3,3,4,4};
		 int res = new NumberOccuringOnce().find(arr);
		 System.out.println(res);
	}

}
