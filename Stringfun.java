package coding_practice;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/*
 * A-1: Implement the below function to print the frequency of non-vowels 
 * (characters which are NOT a, e, i, o, u) in a given string and also print the count of vowels. 
 * (Ignore the character cases, it can be lower or upper case)

The function will take 1 parameter which will be a String (or a character array).
 You do not have to write code to get the input parameter from the user.

int frequencyOfNonVowels(String input) {
        
  if(input)
}

Example:
Input: rajasoft Output: r=1, j=1, s=1, f=1, t=1, vowels=3
Input: Buffet Output: b=1, f=2, t=1, vowels=2
 */

public class Stringfun {
	String str = "Buffet";

	void words() {
		int vCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			switch (c) {
			// program for calculating number of vowels
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vCount++;
			}

		}

		System.out.println("Number of vowels = " + vCount);

	}

	// Function to calculate the frequency
	// of each character in the string
	void frequency() {
		// Creates an empty TreeMap
		TreeMap<Character, Integer> hmap = new TreeMap<Character, Integer>();

		// Traverse through the given array
		for (int i = 0; i < str.length(); i++) {
			Integer c = hmap.get(str.charAt(i));

			// If this is first occurrence of element
			if (hmap.get(str.charAt(i)) == null)
				hmap.put(str.charAt(i), 1);

			// If elements already exists in hash map
			else
				hmap.put(str.charAt(i), ++c);
		}
		hmap.remove('a');
		hmap.remove('e');
		hmap.remove('i');
		hmap.remove('o');
		hmap.remove('u');
		hmap.remove('A');
		hmap.remove('E');
		hmap.remove('I');
		hmap.remove('O');
		hmap.remove('U');
		// Print result
		for (Map.Entry m : hmap.entrySet())

			System.out.println("Character = " + m.getKey() + " Frequency = " + m.getValue());
	}

	// Driver program to run and test above program
	public static void main(String args[]) throws IOException {
		Stringfun obj = new Stringfun();
		obj.words();
		obj.frequency();
	}
}
