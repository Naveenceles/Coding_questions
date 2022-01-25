package coding_practice;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * A-4: Write a program to merge two lists by alternatively taking elements from each list. The method will take 2 arrays as input and return the merged array as output.
Input: [1,2,3] and [a,b,c] Output: [1,a,2,b,3,c]
Input: [1,2,3,4,5] and [a,b,c] Output: [1,a,2,b,3,c,4,5]
Input: [1,2,3] and [a,b,c,d,e] Output: [1,a,2,b,3,c,d,e]
 */

public class mergeTwoarrays {

	public static void main(String args[]) {
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
		ArrayList<Object> list3 = new ArrayList();
		int size = list1.size() + list2.size();
		int min = Math.min(list1.size(), list2.size());

		int p = 0, q = 0;
		for (int i = 0; i < size; i++) {
			if (q < min || p < min) {
				if (i % 2 == 0) {
					list3.add(list1.get(p++));
				} else {
					list3.add(list2.get(q++));
				}

			}
		}
		if (list1.size() > min) {
			for (int i = p; i < list1.size(); i++) {
				list3.add(list1.get(p++));
			}
		} else {
			for (int i = q; i < list2.size(); i++) {
				list3.add(list2.get(q++));
			}
		}

		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}

	}

}
