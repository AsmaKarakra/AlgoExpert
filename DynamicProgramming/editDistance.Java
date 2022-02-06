/**

Time: O(n*m) n = length of str1 and m = length of str 2

Space: O(n*m) n = length of str1 and m = length of str 2


- can improve the space complexity to o(min(n,m)) by only storing the last two rows in the dp table and update
  throughout our algorithim. 

**/



import java.util.*;

public class Playground {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "yabd";

        int result = levenshteinDistance(str1, str2);

        System.out.println(result); //output should be 2

    }

    public static int levenshteinDistance(String str1, String str2) {
        //Create dp table with the size of input + base case
        int[][] dpTable = new int[str2.length() + 1][str1.length() + 1];

        dpTable[0][0] = 0; //Fill in base case

        //fill in rival rows and cols of table
        for (int i = 1; i < str1.length() + 1; i++) {
            dpTable[0][i] = i; //Fill in row 0 with base cases
        }


        for (int i = 1; i < str2.length() + 1; i++) {
            dpTable[i][0] = i; //fill in col 0 with base cases
        }

        for (int i = 1; i < str2.length() + 1; i++) {
            for (int j = 1; j < str1.length() + 1; j++) {
                int delete = dpTable[i - 1][j - 1];
                int swap = dpTable[i][j - 1];
                int remove = dpTable[i - 1][j];

                int nextElm = Math.min(Math.min(delete, swap), remove);

                //if char in str1 and str2 are not equal, add one, else add zero

                if (str2.charAt(i - 1) != str1.charAt(j - 1)) {
                    dpTable[i][j] = nextElm + 1;

                } else {
                    dpTable[i][j] = nextElm;
                }
            }
        }
            return dpTable[str2.length()][str1.length()];
        }
} 




