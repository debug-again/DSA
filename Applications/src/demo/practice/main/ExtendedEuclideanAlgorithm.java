package demo.practice.main;


class XY{
	public int x;
	public int y;
	
	public void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + " y = " + y; 
	}
}


public class ExtendedEuclideanAlgorithm {
	
	public int findGCDExtended(int a, int b, XY var){
		
		if(a == 0){
			var.x = 0;
			var.y = 1;
			return b;
		}
		
		
		XY var1 = new XY();
		
		int gcd = findGCDExtended(b%a, a, var1);
		
		var.x = var1.y - (b/a) * var1.x;
		var.y = var1.x;
		
		return gcd;
		
	}
	
	public static void main(String[] args) {
		int x, y;
	    int a = 1071 , b = 462;
	    XY v = new XY();
	    int g = new ExtendedEuclideanAlgorithm().findGCDExtended(a, b, v);
	    System.out.printf("gcd(%d, %d) = %d, x = %d, y = %d",
	           a, b, g, v.x, v.y);

	}
}
