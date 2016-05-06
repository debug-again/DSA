package demo.practice.main;

import java.util.Arrays;

public class MinCoinChange {
	
	public int count(int[] coins, int value){
		
		int sum[] = new int[value + 1];
		final int INF = Integer.MAX_VALUE;
		Arrays.fill(sum, 1, sum.length, INF);
		
		// for every sum find the min coins req
		for(int i=1, s = sum.length; i< s; i++){
			
			// for every coin selected find the min coins req
			for(int j=0, n = coins.length; j < n; j++){

				if(coins[j] <= i){
					
					int withoutC = sum[i - coins[j]];
					if((withoutC != INF) && (withoutC + 1 < sum[i]))
						sum[i] = withoutC + 1;
				}
			}
		}
		
		return sum[value];
	}
	
	public static void main(String[] args) {
		 int coins[] =  {9, 6, 5, 1};
		 int res = new MinCoinChange().count(coins, 11);
		 System.out.println(res);
	}

}
