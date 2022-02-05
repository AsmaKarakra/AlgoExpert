/**
O(n) Time and O(n) Space

can be solved in o(1) space by keep tracking of lastMaxSum and currentMaxSum through temp vars

**/ 


import java.util.*;

class Program {
   public static int maxSubsetSumNoAdjacent(int[] array) {

            //Base case - empty input
            if (array.length == 0){
                return 0;
            }

            //Edge case - array is size one
            if(array.length == 1){
                return array[0];
            }

            //Edge Case - array is size two
            if(array.length == 2) {
                if (array[0] < array[1]) {
                    return array[1];
                }
            }

                int[] result = new int[array.length];
                result[0] = array[0];
                result[1] = Math.max(array[1],array[0]);

                for (int i = 2; i<array.length; i++){
                    int currentSum = array[i] + result[i-2];
                    int lastSum = result[i-1];
                    result[i] = Math.max(currentSum, lastSum);
                }

                return result[result.length-1];
            }
  }
