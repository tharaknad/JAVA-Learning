package testdemo1;



import java.util.Scanner;

import demo1.Math;
import demo1.MathImpl2;

public class TestMathImpl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for MathImpl2
		System.out.print("Enter'a' in MathImpl2: ");
		int a = sc.nextInt();
		System.out.print("Enter'b' in MathImpl2: ");
		int b = sc.nextInt();
		System.out.println();

		Math m2 = new MathImpl2(a, b);
		m2.addition();
		m2.substraction();

		sc.close();
	}
}
