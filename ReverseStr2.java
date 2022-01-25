package coding_practice;


/**
 * A-2: Write a function that takes an input parameter as a String. The function should reverse the alternate words in it and print it. Words are separated by dots. (Avoid using inbuilt functions)

If input is “i.like.this.program.very.much”
Output will be “i.ekil.this.margorp.very.hcum”
 */
 
public class ReverseStr2 {

	public void reverse(char str[], int start, int end, int count) {

		char temp;

		if (count % 2 == 0) {
			while (start <= end) {

				temp = str[start];
				str[start] = str[end];
				str[end] = temp;
				start++;
				end--;

			}
		}
	}

	public char[] reverseWords(char[] s) {

		int start = 0;
		int count = 1;

		for (int end = 0; end < s.length; end++) {

			if (s[end] == '.') {

				reverse(s, start, end - 1, count);
				start = end + 1;
				count++;

			}
		}

		reverse(s, start, s.length - 1, count);

		return s;
	}

	public static void main(String[] args) {
		ReverseStr2 obj = new ReverseStr2();
		String s = "i.like.this.program.very.much";
		char[] p = obj.reverseWords(s.toCharArray());
		System.out.print(p);
	}

}
