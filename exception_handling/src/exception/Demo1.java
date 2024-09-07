package exception;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 'a' >>>: ");
		int a = sc.nextInt();
		System.out.println(" 'b' >>>:");
		int b = sc.nextInt();

		System.out.println("Add of values :" + a + b);

		try {
			System.out.println("divi of values :" + a / b);
		} catch (Exception e) {
			System.err.println("zero value can't accepted at div");
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Mul of values :" + a * b);
			System.out.println("Execution sucessfull");
		}

		sc.close();

	}

}
