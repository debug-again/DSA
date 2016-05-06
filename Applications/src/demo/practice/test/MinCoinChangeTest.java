package demo.practice.test;

import demo.practice.main.MinCoinChange;

public class MinCoinChangeTest {

	public static void main(String[] args) {
		 int coins[] =  {9, 6, 5, 1};
		 int res = new MinCoinChange().count(coins, 11);
		 System.out.println(res);
	}

}
