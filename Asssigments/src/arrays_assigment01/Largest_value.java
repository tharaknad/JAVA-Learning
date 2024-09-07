package arrays_assigment01;

public class Largest_value {

	public static void main(String[] args) {
		int[] numbers = { 23, 3, 56, 7, 19, 1, 45 };

		int heighest = 0;
		int second_heighest = 0;

		for (int n : numbers) {

			if (heighest < n) {
				second_heighest = heighest;
				heighest = n;
			}

			else if (second_heighest < n) {
				second_heighest = n;

			}
		}

		System.out.println("Heighest number : " + heighest);
		System.out.println("Second Heighest number : " + second_heighest);
	}

}
