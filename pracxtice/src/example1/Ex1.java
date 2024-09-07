package example1;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 e = new Ex1();

		e.addition(100);
		System.out.println("-------------");
		e.addition(100, 200);
		System.out.println("-------------");
		e.addition("new keyword");
		System.out.println("-------------");
		e.addition(23, 10.0);

	}

	void addition(int a) {
		System.out.println(a);
		System.out.println("Int method");

	}

//	void addition(int a, int b) {
//		System.out.println(a + b);
//		System.out.println("int");
//	}

	void addition(int a, int b, int c) {
		c = a + b;
		System.out.println(c);
		System.out.println("Int,Int ,Int Method ");

	}

	void addition(double a) {
		System.out.println(a);
		System.out.println("Double method ");
	}

	void addition(double a, double b) {
		System.out.println(a + b);
		System.out.println("Double ,Double method ");
	}

	void addition(int a, double b) {
		System.out.println(a + b);
		System.out.println("Int , Double method");
	}

	void addition(String a) {

		System.out.println(a);
		System.out.println("String Method ");

	}

}
