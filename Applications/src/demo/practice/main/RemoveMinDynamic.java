package demo.practice.main;

public class RemoveMinDynamic {

	private boolean checkCondition(int[] array, int i, int l) {
		
		boolean res = true;
		
		if(i < l){
			int max = array[i], min = array[i];
			while(i <= l){
				if(max < array[i])
					max = array[i];
				
				if(min > array[i])
					min = array[i];
				
				i++;
			}
			
			if(2*min > max)
				res = true;
			else
				res = false;
		}
		
		return res;
	}

	public int minRemovalsDP(int arr[], int n) {
		
		int[][] dynArr = new int[n][n];
		
		for(int gap = 1; gap < n ; gap++){
			for(int i=0, j = gap; j < n; ++i, j++){
				if(dynArr[i][j] == 0)
					dynArr[i][j] = checkCondition(arr, i ,j) ? 0 : Math.min(dynArr[i+1][j], dynArr[i][j-1]) + 1;
			}
		}
		
		return dynArr[0][n-1];
		
	}

}
