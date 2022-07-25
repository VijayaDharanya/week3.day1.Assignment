/*
 * Pseudo Code
	  //Anagram = two strings anagrams if they contain the same characters but in a different order. 
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
 */
package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// *Declare a String
		String text1 = "stops";
		// *Declare another String
		String text2 = "potss";
		// a) Check length of the strings are same then (Use A Condition)
		if (text1.length() != (text2.length())) {
			System.out.println(" Not a Anagram");

		} else {

			// b) Convert both Strings in to characters
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			// c) Sort Both the arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			// d) Check both the arrays has same value
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			}
		}

	}

}
