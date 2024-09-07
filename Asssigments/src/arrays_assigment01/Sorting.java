package arrays_assigment01;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] array = { 8, 35, 60, 75, 23, 34, 10, 19 };

		System.out.println("Original array : ");

		for (int arr : array) {
			System.out.print(arr + " ");
		}
		Arrays.sort(array);

		System.out.println();
		System.out.println("Sorted array : ");

		for (int arr : array) {
			System.out.print(arr + " ");

		}

	}

}
