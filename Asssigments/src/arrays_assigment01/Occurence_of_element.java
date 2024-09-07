package arrays_assigment01;

public class Occurence_of_element {

	public static void main(String[] args) {

		int[] array = { 2, 3, 4, 5, 4, 3, 2, 5, 4, 3, 3, 4, 3, 2, 9 };

		int target_element = 3;
		int count = 0;

		for (int n : array) {
			if (n == target_element) {
				count++;
			}

		}
		System.out.println("no of times occured : " + count);

	}

}
