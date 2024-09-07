package combinations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {

		System.out.println(" Main Method ");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Inside Try block");
			System.out.println("Enter A>>: ");
			int a = sc.nextInt();
			System.out.println("Eneter B>>: ");
			int b = sc.nextInt();

			System.out.println(a / b);

		} catch (InputMismatchException e) {
			System.err.println(e.toString());

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			sc.close();
			System.out.println("Finall block");

		}

	}

}
