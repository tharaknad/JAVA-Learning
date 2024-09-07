package testainterfacedemo;

import java.util.Scanner;

import interfacedemo.Math;
import interfacedemo.ProblemImpl;

public class TestImpl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter A: ");
		int a = sc.nextInt();
		System.out.println("Eneter B:");
		int b = sc.nextInt();
		System.out.println("---------------------");

		Math Obj = new ProblemImpl(a, b);

		// Accessing methods from the Math interface
		Obj.addition();
		Obj.substraction();
		Obj.multiply();
		Obj.division();

		System.out.println();

		// Accessing static method from the Math interface
		Math.Shapes();

		System.out.println();

		// Accessing default method from the Math interface
		Obj.method1();
		sc.close();
	}
}