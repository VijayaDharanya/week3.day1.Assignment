package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String name="VijayaDharanya";
		char[] charArray=name.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.println(charArray[i]);
			
		}

	}

}
//Classroom 2: Find the count of given character in a String
//String input="VijayaDharanya";