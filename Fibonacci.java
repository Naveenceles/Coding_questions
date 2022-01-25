package coding_practice;

/*
 * A-5: Variation of Fibonacci
The Fibonacci sequence is constructed by adding the last two numbers of the sequence so far to get the next number in the sequence. The first and the second numbers of the sequence are defined as 0 and 1. We get:
0, 1, 1, 2, 3, 5, 8, 13, 21…
 
Write a function which takes input as a number:
If the given number is a Fibonacci number, print the number
If the given number is NOT Fibonacci number, print the sum of all even Fibonacci numbers less than the given number.

int getFibOutput(int input) {
          // TODO: 
}
 
Example
(21 is a Fibonacci number)
Input: 21 Output: 21
(20 is NOT a Fibonacci number so, output is 10 (2+8)) 
Input: 20 Output: 10
 */

public class Fibonacci
{
	public int isFibonacci(int n)
	{
			int a=0;
			int b=1;
			int c=0;
			int sum=0;
			while(c<=n) {
				 
				c=a+b;
				
				if(c==n)
					return n;
				else if(c%2==0)
					sum+=c;
					
				a=b;
				b=c;
			
			}
			
				return sum;
			
		}
	
	public static void main(String[] args)
	{
		Fibonacci obj=new  Fibonacci();
		//
		System.out.println(obj.isFibonacci(20));
	}
}

