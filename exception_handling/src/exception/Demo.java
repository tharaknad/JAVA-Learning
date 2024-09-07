package exception;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("A >>:");
		int a=sc.nextInt();
		System.out.println("B >>:");
		int b=sc.nextInt();
		
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(a*b);
		

	}

}
