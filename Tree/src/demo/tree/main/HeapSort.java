package demo.tree.main;

public class HeapSort {
	
	public void sort(int[] array){
		
		int n = array.length;
		
		// building heap : rearranfing array
		for(int i= n/2 - 1; i >= 0; --i){
			heapify(array, i, n);
		}
		
		// one by one extract the array
		
		for(int i= n-1; i>=0; --i){
			swap(array, 0, i);	// swap root and the last element (root is the max element after heapifying)
			heapify(array, 0, i);	// heapify first pos upto i only
		}
		
		
	}
	
	private void heapify(int[] array, int index, int size){
		
		int max = index;
		int l = left(index);
		int r = right(index);
		
		if(l < size && array[l] > array[max])
			max = l;
		
		if(r < size && array[r] > array[max])
			max = r;
		
		if(max != index){
			swap(array, max, index);
			heapify(array, max, size);
		}
	}

	private void swap(int[] array, int i1, int i2) {
		int temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
	}
	
	private int left(int index){
		return 2*index + 1;
	}
	
	private int right(int index){
		return left(index) + 1;
	}

	public void printKLargest(int[] arr, int k) {
		
		int n = arr.length;
		if(k > n){
			System.out.println("K should be less than array size : " + n);
			return; 
		}
		
		System.out.print(k + " largest elements of array : ");
		
		for(int i=n/2 - 1; i >=0; --i)
			heapify(arr, i, n);
		
		for(int i= n-1; i>= n-k ; --i){
			swap(arr, 0, i);
			heapify(arr, 0, i);
			System.out.print(arr[i] + " ");
		}
		
	}
}
