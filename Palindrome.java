// find the given string is palindrome or not
/*
* Pseudo Code

* a) Declare A String value as"madam"
* b) Declare another String rev value as ""
* c) Iterate over the String in reverse order
* d) Add the char into rev
* e) Compare the original String with the reversed String, if it is same then print palinDrome 

* Hint: Use .equals or .equalsIgnoreCase when you compare a String 
*/
package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// Declare A String value as"madam"
		String word = "madam";

		// Declare another String rev value as ""
		String rev = "";
		// Iterate over the String in reverse order
		for (int i = word.length() - 1; i >= 0; i--) {
			// Add the char into rev
			rev = rev + word.charAt(i);

		}
		System.out.println(rev);
		// Compare the original String with the reversed String, if it is same then
		// print palinDrome
		if (word.equals(rev)) // string does not support == so we use .equals
		{
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
