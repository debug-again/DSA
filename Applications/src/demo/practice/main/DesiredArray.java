package demo.practice.main;

import static java.lang.Math.*;

public class DesiredArray {
	
	int count(int[] array){
		
		int count = 0, maxEven = 0, num;
		
		for(int i=0, n = array.length; i< n; i++){
			
			if(array[i] == 1)
				return sumArray(array);
			
			num = array[i];
			
			if(isEven(num) && num > maxEven)
				maxEven = num;
		}
		
		
		if(maxEven > 0){
			
			count = array.length;	// make all elements 1 so n times
			int pow = (int) (log(maxEven) / log(2));
			
			count += pow;
			for(int i=0, n = array.length; i< n; i++){
				
				if(array[i] > maxEven) 	// array[i] < maxEven is error scenario
					count += array[i] - maxEven;
			}
		}
		
		return count;
		
	}

	private boolean isEven(int num) {
		return (num & 1) == 0;
	}

	private int sumArray(int[] array) {
		int sum = 0;

		for (int i = 0, n = array.length; i < n; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] array = {16, 16, 16};
		int res = new DesiredArray().count(array);
		System.out.println(res);
		
	}

}
