/**
o(n) time

o(1) space because we can have at most 26 values in our table.


The problem's prompt specifies that the input string only contains lowercase English-alphabet letters. 
Since there are only 26 lowercase English-alphabet letters, our hash table will never store more than 26 character frequencies; 
thus, the optimal solution's space complexity is O(1). If the input string could contain any character, then the space complexity would be O(n).

This type of detail should always be confirmed with your interviewer in a real coding interview. 

**/ 


//Solution Passed all test cases


import java.util.*;

class Program {
 public static int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++){
            if (map.containsKey(string.charAt(i))){
                int value = map.get(string.charAt(i));
                map.put(string.charAt(i),value + 1 );
                continue; 
            }
            map.put(string.charAt(i), 1);
        }

        Set<Map.Entry<Character, Integer>> mapSet = map.entrySet();

        for(Map.Entry<Character, Integer> entry: mapSet){
            int value = entry.getValue();

            if (value == 1){
                return string.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}


/**

Test cases: 

Test Case 1

{
  "string": "abcdcaf"
}

Test Case 2

{
  "string": "faadabcbbebdf"
}

Test Case 3

{
  "string": "a"
}

Test Case 4

{
  "string": "ab"
}

Test Case 5

{
  "string": "abc"
}

Test Case 6

{
  "string": "abac"
}

Test Case 7

{
  "string": "ababac"
}

Test Case 8

{
  "string": "ababacc"
}

Test Case 9

{
  "string": "lmnopqldsafmnopqsa"
}

Test Case 10

{
  "string": "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy"
}

Test Case 11

{
  "string": "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
}

Test Case 12

{
  "string": ""
}

Test Case 13

{
  "string": "ggyllaylacrhdzedddjsc"
}

Test Case 14

{
  "string": "aaaaaaaaaaaaaaaaaaaabbbbbbbbbbcccccccccccdddddddddddeeeeeeeeffghgh"
}

Test Case 15

{
  "string": "aabbccddeeff"

**/ 
