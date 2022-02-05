/**
Time: o(n*d)      n = change    d = coins avaliable

Space: O(n)


**/

import java.util.*;

class Program {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
  	int [] ways = new int[n+1]; 
		Arrays.fill(ways, 700000);  //assume max number of coins is 700000
		ways[0] = 0; 
		for (int i = 0; i < denoms.length; i++){
			for (int j = 1; j < ways.length; j++ ){
				if(j >= denoms[i]){
					ways[j] = Math.min(ways[j], 1+ ways[j-denoms[i]]);
				}
				continue;		 
			}
		}
		//edge case: If we cannot make change out of denoms, return -1
		if(ways[ways.length-1] == 700000){
			return -1;
		}
    return ways[ways.length-1]; 
  }
}
