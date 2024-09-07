package demo1;

import java.util.Scanner;

public class TestImpl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// User input for MathImpl2
		System.out.print("Enter'a' in MathImpl2:");
		int a = sc.nextInt();
		System.out.print("Enter'b' in MathImpl2:");
		int b = sc.nextInt();
		System.out.println();

		MathImpl m2 = new MathImpl2(a, b);
		m2.addition();
		m2.substraction();
		

		System.out.println("=========================");

		// User input for MathImpl3
		System.out.print("Enter'd' in MathImpl3:");
		int d = sc.nextInt();
		System.out.print("Enter'e' in MathImpl3:");
		int e = sc.nextInt();
		System.out.println();

		Math m3 = new MathImpl3(d, e);
		m3.multiply();
		m3.division();

		sc.close();
	}
}
