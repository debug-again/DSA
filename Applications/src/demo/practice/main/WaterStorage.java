package demo.practice.main;

import static java.lang.Math.*;

public class WaterStorage {
	
	private int find(int[] array){
		
		int n = array.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int water = 0;
		
		left[0] = array[0];
		right[n-1] = array[n-1];
		
		//find max height in the left
		
		for(int i=1; i<n;i++){
			left[i] = max(array[i], left[i-1]);
		}
		
		for(int i=n-2; i>=0;i--){
			right[i] = max(array[i], right[i+1]);
		}
		
		for(int i=0; i<n; i++){
			water += min(left[i], right[i]) - array[i];
		}
		
		return water;
		
	}
	
	public void findWater(int[] array){
		
		int res= find(array);
		System.out.println("Water stored : " + res);
	}

}
