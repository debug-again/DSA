package demo.practice.test;

import demo.practice.main.CheckPower;

public class CheckPowerTest {

	public static void main(String[] args) {
		CheckPower power = new CheckPower();
		boolean res = power.check(102, 10);
		System.out.println(res);
	}
}
