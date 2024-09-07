package arrays_assigment01;

import java.util.Scanner;

public class InputOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array : ");
		int n = sc.nextInt();

		String[] names = new String[n];

		System.out.println("Enter names into array: ");
		for (int i = 0; i < n; i++) {
			names[i] = sc.nextLine();

		}
		System.out.println();
		for (int j = 0; j < n; j++) {

			if (names[j].endsWith("i"))
				System.out.println("names ends with 'i' are :" + names[j]);

		}

	}
}
