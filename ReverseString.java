package coding_practice;

/*
 * A-2: Write a function that takes an input parameter as a String. 
 * The function should reverse the statement but keep the words intact and print it.
 *  Words are separated by dots. (Avoid using inbuilt functions)

If input is “i.like.this.program.very.much”
Output will be “much.very.program.this.like.i”

 */
public class ReverseString
{
	// Java program to reverse
	// a String
	// Reverse the letters of
	// the word
	
	static void reverse(char str[],
						int start,
						int end)
	{
	// Temporary variable to
	// store character
	char temp;
		
	while (start <= end)
	{
		// Swapping the first and
		// last character
		temp = str[start];
		str[start] = str[end];
		str[end] = temp;
		start++;
		end--;
	}
	}
	// Function to reverse words
	static char[] reverseWords(char []s)
	{
	// Reversing individual words as
	// explained in the first step
	int start = 0;
	for (int end = 0; end < s.length; end++)
	{
		// If we see a dot, we reverse the
		// previous word (word between
		// the indexes start and end-1
		// i.e., s[start..end-1]
		if (s[end] == '.')
		{
		reverse(s, start, end-1);
		start = end + 1;
		}
	}

	// Reverse the last word
	reverse(s, start, s.length - 1);

	// Reverse the entire String
	reverse(s, 0, s.length - 1);
	return s;
	}

	// Driver Code
	public static void main(String[] args)
	{
	String s =
	"i.like.this.program.very.much";
	char []p = reverseWords(s.toCharArray());
	System.out.print(p);
	}
	
	

}