package demo.practice.test;

import demo.practice.main.RemoveMin;
import demo.practice.main.RemoveMinDynamic;

public class RemoveMinTest {

	public static void main(String[] args) {

		int array[] = {4, 5, 100, 9, 10, 11, 12, 15, 200};
		int res;
		
		RemoveMin min = new RemoveMin();
		long start = System.nanoTime();
		res = min.trim(array);
		long stop = System.nanoTime();
		
		System.out.println(res);
		System.out.println("Time Taken 1 :"  + (stop - start) + " nano");
		
		RemoveMinDynamic rmin = new RemoveMinDynamic();
		start = System.nanoTime();
		res = rmin.minRemovalsDP(array, array.length);
		stop = System.nanoTime();
		
		System.out.println(res);
		System.out.println("Time Taken 2 :"  + (stop - start) + " nano");
	}

}
