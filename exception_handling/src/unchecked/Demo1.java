package unchecked;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("Mani method");
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("try blaock");

			System.out.println(" Enter A>>:");
			int a = sc.nextInt();
			System.out.println("Enter B>>:");
			int b = sc.nextInt();

			System.out.println(a / b);

		} catch (Exception e) {

			System.err.println(e.toString());
		}
		System.out.println(" Outside catch ");

	}

}          
