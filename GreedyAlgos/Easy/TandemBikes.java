
/**


Time: O(n*log(n)) - sort using quick sort in java API. 

Space: O(1) - Arrays are sorted in place 


**/

import java.util.*;

class Program {

public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {


    //Sort the arrays using quick sort java API - average o(n*log(n))


        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        if (fastest){
            return calcMaxSpeed(redShirtSpeeds, blueShirtSpeeds);
        }

        return calcMinSpeed(redShirtSpeeds, blueShirtSpeeds);
    }



    public static int calcMinSpeed(int[] redShirtSpeeds, int[] blueShirtSpeeds){
        int minValue = 0;
        int minSpeed = 0;

        
        //Choose biggest value out of two large values for min speed we can create from array 
        
        for(int i = 0; i<redShirtSpeeds.length; i++){
            int currentRed = redShirtSpeeds[i];
            int currentBlue = blueShirtSpeeds[i];
            minSpeed = Math.max(currentRed, currentBlue);
            minValue += minSpeed;
        }

        return minValue;

    }

    public static int calcMaxSpeed(int[] redShirtSpeeds, int[] blueShirtSpeeds){
        int maxValue = 0;
        int maxSpeed = 0;
        
        //pair one big idx and one small idx for maxSpeed 

        for(int i = 0; i<redShirtSpeeds.length; i++){
            int currentRed = redShirtSpeeds[i];
            int currentBlue = blueShirtSpeeds[blueShirtSpeeds.length - 1 - i];
            maxSpeed = Math.max(currentRed, currentBlue);
            maxValue += maxSpeed;
        }

        return maxValue;

    }
}
