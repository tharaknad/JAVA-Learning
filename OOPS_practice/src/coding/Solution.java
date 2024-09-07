package coding;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num: ");
		int n = sc.nextInt();

		AdvancedArithmetic A = new Caluclator();

		System.out.println(A.divisor_sum(n));

		sc.close();

	}

}
