
/**

O(n+m) Time and O(c) where n = length of characters and m = is length of documents 

**/

import java.util.*;

class Program {

   public static boolean generateDocument(String characters, String document) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i<characters.length(); i++){
            char letter = characters.charAt(i);
            if (charMap.containsKey(letter)){
                int value = charMap.get(letter);
                charMap.put(letter, value+1);
                continue;
            }
            charMap.put(letter,1);
        }

        for (int j=0; j < document.length(); j++){
            char letterDoc = document.charAt(j);
            if(!charMap.containsKey( letterDoc)){
                return false;
            }
            int keyValue = charMap.get(letterDoc);

            if(keyValue < 1){
                return false;
            }
            charMap.put(letterDoc, keyValue - 1);
        }
        return true;
    }
}
