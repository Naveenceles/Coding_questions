package coding_practice;

/*
 * A-3: Implement a method to perform basic string compression using the counts of repeated characters.
 *  E.g.; the string aabcccccaaa would become a2b1c5a3. If “compressed” string would not be smaller 
 *  than the original string, your method should return the original string. Assume string has only 
 *  lowercase letters (a-z).
For “aabcccccaaa” input, your method will return “a2b1c5a3” but for “abcd” input, 
your method will return “abcd”

The method would take input as the string and return the compressed string per above logic.
 */

public class ReapeatedChar {
	public static String countRepeatedChars(String str){
	    int initialLength = str.length();
	    char[] chars = str.toCharArray();
	    int occurances = 0;
	    String compressedString = "";
	    char currentChar = chars[0];

	    for(int i = 0; i < initialLength; i++){
	        char c  = chars[i];
	        if(currentChar == c && i + 1 <= initialLength){
	            occurances++;
	        }

	        else if (currentChar != c || i + 1  > initialLength){

	            compressedString += currentChar + String.valueOf(occurances);
	            currentChar = chars[i];
	            occurances = 1;
	        }

	        if(i + 1 >=  initialLength){
	            compressedString += currentChar + String.valueOf(occurances);

	        }
	    }
	    if(compressedString.length() < initialLength){
	         return compressedString;
	    }
	    return str;
	}
	
	public static void main(String[] args) {
		String str="aabbbcccaaaddd";
		String new_str=countRepeatedChars(str);
		System.out.println(new_str);
	
	}
}
