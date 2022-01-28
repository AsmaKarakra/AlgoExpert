import java.util.*;


/**


Sort the array and execuate queries in ascending order. The largest element should be at the end of the array. 


Time Complexity: O(n*log(n) ---- for sorting the array using quick sort in java API. 

Space: O(1) ------ returning an int value, not using an auxuillary data structs. 

**/ 
public class Playground {

    public static void main(String[] args) {

        int[] queries = new int[] {3, 2, 1, 2, 6};
        int y = minimumWaitingTime(queries);
        System.out.println(y);


    }


    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int currentWaitingTime = 0;
        int minWaitingTime = 0;

        for(int i = 1; i <queries.length; i++){
            int currentElement = queries[i];
            currentWaitingTime = currentWaitingTime + queries[i-1];
            minWaitingTime = minWaitingTime+currentWaitingTime;
        }

        return minWaitingTime;

    }
}

