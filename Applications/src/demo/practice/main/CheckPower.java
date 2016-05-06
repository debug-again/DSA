package demo.practice.main;

import static java.lang.Math.*;

public class CheckPower {
	
	public boolean check(int x, int y){
 
		if (y == 1) {
			return true;
		}

		double res = (log10(x) / log10(y));
		return (res - ceil(res)) == 0;
	}
	
}
