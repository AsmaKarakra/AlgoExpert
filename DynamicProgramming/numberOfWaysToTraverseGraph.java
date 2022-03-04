import java.util.*;

class Program {

  public int numberOfWaysToTraverseGraph(int width, int height) {
		//Time Complexity: O(n*m) time | Space Complexity: O(n*m) time 
		
		//Create dp array 
		int[][] dp = new int[width+1][height+1]; 
		
		//initalize first row with zeros - trivial values 
		for (int i = 0; i < width+1; i++){
			dp[i][0] = 0; 
		}
		
		//Initalize first column with zeros
		for(int j = 0; j <height+1; j++){
			dp[0][j] = 0; 
		}
		
		//edge case: Can never have a matrix that is 1*1
		dp[1][1] = 0; 
		
		for(int i = 1; i < dp.length; i++){
			for(int j = 1; j < dp[0].length; j++){
				dp[i][j] = Math.max(1,dp[i-1][j] + dp[i][j-1]);
			}
		}		
    return dp[dp.length-1][dp[0].length-1]; 
  }
}
