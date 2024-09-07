package polymorphism1;

public class Demo1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();

		d.addition(8);
		d.addition(0, 0);
		d.addition(0, 0);
		d.addition(0, 0);

	}

	void addition(int a) {

		System.out.println(a);
	}

	void  addition(int a, int b) {
		System.out.println(a+b);
	}

	void  addition(float a, int b) {
		System.out.println(a+b);
	}
	void addition (double a,double b) {
		System.out.println(a+b);
	}

}
