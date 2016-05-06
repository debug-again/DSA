package demo.practice.test;

import demo.practice.main.WaterStorage;
import demo.practice.util.RunWithTimeTrace;

public class WaterStorageTest {

	public static void main(String[] args) {

		//	int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int arr[] = {3, 0, 0, 2, 0, 4};
		RunWithTimeTrace.run(WaterStorage.class, "findWater", arr);
	}

}
