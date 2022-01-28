import java.util.*


/**


Sort array and then set element with the largest last index as the back row, then traverse both arrays, 
if back row is less than or equal to element in front row, return false. 


Time: O(n*Log(n)) --- Assuming both arrays are same size, arrays are sorted using quick sort java API. 

Space: O(1) 

**/

public class Playground {

    public static void main(String[] args) {

        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));

        boolean result = classPhotos(redShirtHeights, blueShirtHeights);




    }


    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);


        int redLen = redShirtHeights.size();
        int bueSize = blueShirtHeights.size();

        if (redShirtHeights.get(redLen-1) <= blueShirtHeights.get(bueSize -1)){
            return arrHelper(blueShirtHeights,redShirtHeights);
        }

        return arrHelper(redShirtHeights, blueShirtHeights);
    }

    public static boolean arrHelper(ArrayList<Integer> backRow, ArrayList<Integer> frontRow){
        for(int i = 0; i< backRow.size(); i++) {
            if (backRow.get(i) <= frontRow.get(i)) {
                return false;
            }
        }

        return true;
    }
}

