
/**


Time: O(n*log(n))

Space: O(1) 


**/

import java.util.*;

public class Playground {

    public static void main(String[] args) {

        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;

        int result = tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);

        System.out.println(result);


    }

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

        for(int i = 0; i<redShirtSpeeds.length; i++){
            int currentRed = redShirtSpeeds[i];
            int currentBlue = blueShirtSpeeds[blueShirtSpeeds.length - 1 - i];
            minSpeed = Math.min(currentRed, currentBlue);
            minValue += minSpeed;
        }

        return minValue;

    }

    public static int calcMaxSpeed(int[] redShirtSpeeds, int[] blueShirtSpeeds){
        int maxValue = 0;
        int maxSpeed = 0;

        for(int i = 0; i<redShirtSpeeds.length; i++){
            int currentRed = redShirtSpeeds[i];
            int currentBlue = blueShirtSpeeds[blueShirtSpeeds.length - 1 - i];
            maxSpeed = Math.max(currentRed, currentBlue);
            maxValue += maxSpeed;
        }

        return maxValue;

    }

}

