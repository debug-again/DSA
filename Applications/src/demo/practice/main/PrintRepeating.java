package demo.practice.main;

import static java.lang.Math.abs;

public class PrintRepeating {
	
	public void printRepeating(int arr[], int size) {
		int i;
		System.out.printf("The repeating elements are: \n");
		for (i = 0; i < size; i++) {
			if (arr[abs(arr[i])] >= 0)
				arr[abs(arr[i])] = - arr[abs(arr[i])];
			else
				System.out.printf(" %d ", abs(arr[i]));
		}
	}

}
