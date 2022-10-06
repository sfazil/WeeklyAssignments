package week1.assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);
		int count = 0;

		System.out.println("The lenght of the array is " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count += 1;
					System.out.println("The duplicate value is: "+arr[i]);
				}
			}
		}
		System.out.println("The duplicate count is " + count);
	}
}

