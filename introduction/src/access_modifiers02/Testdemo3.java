package access_modifiers02;

import access_modifiers1.Testdemo1;

public class Testdemo3 extends Testdemo1 {

	public static void main(String[] args) {

		Testdemo3 t3 = new Testdemo3();//object
		
		// protected data
		System.out.println(t3.id5);
		System.out.println(Testdemo1.id6);
		t3.method3();

		System.out.println();
		System.out.println();

		
		// public data
		System.out.println(t3.id7);
		System.out.println(Testdemo1.id8);
		t3.method4();

	}

}
