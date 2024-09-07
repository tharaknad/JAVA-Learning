package arrays_assigment01;

// program to find prime number 
public class Primenumber {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 5, 7,10, 11, 13, 4, 17, 19, 23, 1 };

		System.out.println("Prime numbers are : ");
		

		for (int num : numbers) {
			if (isPrime(num)) {

				System.out.print(num + " ");

			}
		}

	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // not a prime
			}
		}

		return true; // prime number
	}
}