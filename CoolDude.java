package coding_practice;

/**
 * A-4: Write a program that prints the numbers from 100 to 500.
 But for multiples of 7, print “Cool” instead of the number
 For multiples of 11 print “Dude” instead of the number.
 For numbers which are multiples of both 7 and 11 print “Cool Dude” instead of the number
 */

public class CoolDude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=100;i<=500;i++) {
			if(i%7==0)
				System.out.println("Cool");
			else if(i%11==0)
				System.out.println("Dude");
			else if(i%77==0)
				System.out.println("CoolDude");
			else
				System.out.println(i);
				
		}
	}

}
