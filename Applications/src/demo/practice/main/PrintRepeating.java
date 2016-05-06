package demo.practice.main;

import static java.lang.Math.abs;

public class PrintRepeating {
	
	void printRepeating(int arr[], int size) {
		int i;
		System.out.printf("The repeating elements are: \n");
		for (i = 0; i < size; i++) {
			if (arr[abs(arr[i])] >= 0)
				arr[abs(arr[i])] = - arr[abs(arr[i])];
			else
				System.out.printf(" %d ", abs(arr[i]));
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 3, 16, 16};
		new PrintRepeating().printRepeating(arr, arr.length);
	}

}
