package testcoding;
import java.util.Scanner;


import coding.AdvancedArithmetic;
import coding.Caluclator;

public class TestImpl  {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		
		AdvancedArithmetic A=new Caluclator();

		System.out.println(A.divisor_sum(n));
		sc.close();
		

	}

}
