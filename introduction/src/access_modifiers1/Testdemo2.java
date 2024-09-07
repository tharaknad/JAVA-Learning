package access_modifiers1;

public class Testdemo2 {

	public static void main(String[] args) {

		Testdemo1 t2 = new Testdemo1();

		// default method
		System.out.println(t2.id3);
		System.out.println(Testdemo1.id4);
		t2.method2();

		System.out.println();
		System.out.println();

		// protected method
		System.out.println(t2.id5);
		System.out.println(Testdemo1.id6);
		t2.method3();

		System.out.println();
		System.out.println();

		// public method
		System.out.println(t2.id7);
		System.out.println(Testdemo1.id8);
		t2.method4();

	}

}
