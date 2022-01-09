/**
Time: O(n) n = length of input string

Space: O(n) n = length of input string 

**/ 


import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
   String letters = "abcdefghijklmnopqrstuvwxyz"; 
		char[] arr = new char[str.length()]; 
		int newKey = key%26; //To handle large keys larger than number of letters in english language 
		//Edge case
		if (key == 0){
			return str; 
		}
		for (int i= 0; i<str.length(); i++){
			int charIdx = letters.indexOf(str.charAt(i));
			int newCharIdx = (charIdx+key)%26; 
			arr[i] = letters.charAt(newCharIdx);
		}
		
  	return String.valueOf(arr);
  }
}
