/*Method overlaoding --->compile time polymorphism
 * -class which have multiple method with same name but 1)diffrent no. of parameters or 2)diffrent type of the parameteters
 * -3)return type can be same or diffrent
 * 
 *  2 methods for add (1 method with 2 args, 1 method with 3 args)
- 2 methods for multiply (1 method with 2 int agrs, 1 method with 1 int arg and 1 double arg)
- 2 methods for subtract (1 method with 2 int args, 1 methods with 2 double args)
- 2 methods for divide (1 method with 2 int args, 1 methods with 1 double arg and 1 int arg)*/
package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// a) Declare An array for {3,2,11,4,6,7};
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		// b) Declare another array for {1,2,8,4,9,7};
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		System.out.println("Intersection of two arrays : ");
		// c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr1.length; i++) {

			// d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr2.length; j++) {

				// e) Compare Both the arrays using a condition statement
				if (arr1[i] == arr2[j]) {
					// f) Print the first array (should match item in both array)
					System.out.print(arr1[i] + " ");
				}

			}
		}

	}
}
