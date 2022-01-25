package coding_practice;
/*
 * A-3: Write a function which takes an input parameter as an array of integers and 
 * prints the sum of all prime numbers from the given array. 
 * If all integers present in the input array are non-prime the program should print sum as 0.

Example:
Input1: [1, 14, 5, 7] Output: sum=12
Input2: [2, 10, 13, 9] Output: sum=15
 */

public class SumOfPrimeNos {
	public static void main(String[] args) {
		int[] array = { 1, 14, 5, 7 };
		int sum = 0;
		// loop through the numbers one by one
		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;
			if (array[i] == 1)
				isPrime = false;
			else {
				// check to see if the numbers are prime
				for (int j = 2; j <= array[i] / 2; j++) {
					if (array[i] % j == 0) {

						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				if (array[i] == 0) {
				} else {
					sum = sum + array[i];

				}
			}
		}
		System.out.println(sum);
	}
}