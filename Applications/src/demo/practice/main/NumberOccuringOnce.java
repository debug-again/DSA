/*
 * In a sorted array every number is present twice, only one number is present one time. 
 * You have to find the number occurring once. Expected complexity : O(log N)
 */

package demo.practice.main;

public class NumberOccuringOnce {

	public int find(int[] arr) {

		if (arr.length == 0 || (arr.length & 1) == 0)
			return -1;

		return findUtil(arr, 0, arr.length - 1);
	}

	private int findUtil(int[] arr, int i, int j) {

		if(i == j)
			return arr[i];
		
		int mid = i + (j-i)/2;
		
		if(arr[mid] == arr[mid+1])
			mid--;
		
		// check which side has odd count
		if(hasOddCount(i, mid)){
			return findUtil(arr, i, mid);
		}else{
			return findUtil(arr, mid+1, j);
		}
	}
	
	private boolean hasOddCount(int start, int end){
		return ((end - start + 1) & 1) == 1;
	}
	
}
