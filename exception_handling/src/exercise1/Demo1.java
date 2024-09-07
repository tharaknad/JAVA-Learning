package exercise1;


import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Before try block ");

		try {
			try {
				System.out.println("A>>:");
				int a = sc.nextInt();
				System.out.println("B>>:");
				int b = sc.nextInt();
				System.out.println(a / b);

			} catch (Exception e) {
				System.err.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Aftrer try block");
		sc.close();

	}

}
