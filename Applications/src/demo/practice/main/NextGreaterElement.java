package demo.practice.main;

public class NextGreaterElement {

	int[] arr;
	int[] grt;
	int n;

	public NextGreaterElement(int arr[]) {
		this.arr = arr;
		this.n = arr.length;
		grt = new int[n];
		grt[n - 1] = -1;
		construct();
	}

	private void construct() {
		int ng = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i + 1] > arr[i]) {
				ng = arr[i+1];
			}
			grt[i] = ng;
		}
	}

	public int of(int i) {
		return grt[i];
	}

	public static void main(String[] args) {

		int arr[] = { 4, 5, 2, 25 };
		NextGreaterElement nge = new NextGreaterElement(arr);
		int res = nge.of(1);
		System.out.println(res);
	}

}
