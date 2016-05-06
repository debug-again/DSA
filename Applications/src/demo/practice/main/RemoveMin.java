package demo.practice.main;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an unsorted array, trim the array such that twice of minimum is greater than maximum in the trimmed array. 
 * Elements should be removed either end of the array.
 * Number of removals should be minimum.
 */

public class RemoveMin {
	
	private int retain;
	List<Integer> list;
	
	public int trim(int[] array){ 
		trimUtil(array, 0 , array.length -1);
		System.out.println(list);
		return array.length - retain;
	}

	private void trimUtil(int[] array, int i, int l) {
		boolean check = checkCondition(array, i, l);
		if(check){
			if((retain < (l-i+1)))
				{
					retain = (l-i+1);
					list = new ArrayList<>();
					for(int c = i; c <= l; c++){
						list.add(array[c]);
					}
				}
		}else{
			trimUtil(array, i+1, l);
			trimUtil(array, i, l-1);
		}
		
	}

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
	
}
