package arrays;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 22, 23, 48, 56, 77, 89, 76 };

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even number :" + arr[i]);

			} else {
				System.out.println("Odd numvers :" + arr[i]);
			}
		}

	}

}
