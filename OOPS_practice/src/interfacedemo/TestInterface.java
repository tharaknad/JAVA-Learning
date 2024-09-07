package interfacedemo;

import java.util.Scanner;

public class TestInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter A: ");
		int a=sc.nextInt();
		System.out.println("Eneter B:");
		int b=sc.nextInt();
		System.out.println();
		
		
		Math M = new ProblemImpl(a, b);

		// Accessing methods from the Math interface
		M.addition();
		M.substraction();
		M.multiply();
		M.division();
		// Accessing static method from the Math interface
		System.out.println();
		M.method1();
		// Accessing default method from the Math interface
		System.out.println();
		Math.Shapes();
		sc.close();

	}

}
