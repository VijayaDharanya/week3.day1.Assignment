/*Method overlaoding --->compile time polymorphism
 * -class which have multiple method with same name but 1)diffrent no. of parameters or 2)diffrent type of the parameteters
 * -3)return type can be same or diffrent
 * 
 *  2 methods for add (1 method with 2 args, 1 method with 3 args)
- 2 methods for multiply (1 method with 2 int agrs, 1 method with 1 int arg and 1 double arg)
- 2 methods for subtract (1 method with 2 int args, 1 methods with 2 double args)
- 2 methods for divide (1 method with 2 int args, 1 methods with 1 double arg and 1 int arg)*/
package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Declare String Input as Follow
		String test = "changeme";
		// Convert the String to character array
		char[] ch = test.toCharArray();

		int length = test.length();
		// Traverse through each character (using loop)
		for (int i = 0; i < ch.length; i++) {
			// find the odd index within the loop (use mod operator)
			if (i % 2 != 0) {
				System.out.println("Odd Index " + ch[i]);
		// d)within the loop, change the character to uppercase,if the index is odd else
				// don't change

				ch[i] = Character.toUpperCase(ch[i]);

				System.out.println("UpperCase Odd Index " + ch[i]);

			}

		}
	}

}
