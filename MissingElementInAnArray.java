/* the input
		int[] arr = {1,2,3,4,7,6,8};
   a)Sort the array
  b) loop through the array (start i from arr[0] till the length of the array)
    c)check if the iterator variable is not equal to the array values respectively
	d) print the number
	e)once printed break the iteration
				
	*/
package week3.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// Sort the array
		Arrays.sort(arr);
		int len = arr.length;
		// loop through the array (start i from arr[0] till the length of the array)

		System.out.print("Array element : ");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		for (int i = 1; i < len; i++) {
			if (arr[i] - arr[i - 1] == 1) {
				continue;
			} else {
				// once printed break the iteration
				System.out.println("Missing Array element : " + (arr[i - 1] + 1));
				break;
			}
		}

	}
	/*
	 * int sum1 = 0;//without break and continue for (int i = 0; i < arr.length;
	 * i++) { // check if the iterator variable is not equal to the array values
	 * respectively sum1 = sum1 + arr[i];
	 * 
	 * } // print the number System.out.println("sum of elements in array:" + sum1);
	 * int sum2 = 0; for (int i = 1; i <= 8; i++) { sum2 = sum2 + i;
	 * 
	 * } System.out.println("sum of range of elements in array:" + sum2);
	 * 
	 * System.out.println("Missing elements in array:" + (sum2 - sum1));
	 */

}
