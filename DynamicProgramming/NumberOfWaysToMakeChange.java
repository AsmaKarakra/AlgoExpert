/**

Time: O(n*d) n = amount of change, d = size of denmos

Space: O(n)

DP: Using Tabulation - Bottom Up 

**/

import java.util.*;

class Program {
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    int [] waysToMakeChange = new int[n+1]; 
		
		//Can make change one way for zero coins, do nothing! 
		waysToMakeChange[0] = 1; 
		
		for(int i = 0; i< denoms.length; i++){
			for(int ways = 1; ways <waysToMakeChange.length; ways++){
				if(denoms[i] > ways){
					continue; 
			}
					waysToMakeChange[ways] += waysToMakeChange[ways - denoms[i]];
		}
		}
    return waysToMakeChange[waysToMakeChange.length -1]; 
  }
}
