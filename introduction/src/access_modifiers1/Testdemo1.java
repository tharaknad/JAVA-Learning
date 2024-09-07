package access_modifiers1;

 public class Testdemo1 {

	private int id1 = 12;
	private static int id2 = 13;

	private void method1() {
		System.out.println("Private method");

	}

	int id3 = 13;
	static int id4 = 14;

	void method2() {
		System.out.println("Default method");
	}

	protected int id5 = 15;
	protected static int id6 = 16;

	protected void method3() {
		System.out.println("protected  method");
	}

	public int id7 = 17;
	public static int id8 = 18;
	
	public void method4() {
		System.out.println("Public method");
	}

	public static void main(String[] args) {

		Testdemo1 t = new Testdemo1();
		// Private modifier
		System.out.println(t.id1);
		System.out.println(Testdemo1.id2);
		t.method1();

		System.out.println();
		System.out.println();
		// Default modifier
		System.out.println(t.id3);
		System.out.println(Testdemo1.id4);
		t.method2();

		System.out.println();
		System.out.println();
		// protected method
		System.out.println(t.id5);
		System.out.println(Testdemo1.id6);
		t.method3();
		
		System.out.println();
		System.out.println();
		// public method
		System.out.println(t.id7);
		System.out.println(Testdemo1.id8);
		t.method4();

	}

	protected class testdemo {

		static {
			System.out.println("Static block!!");
		}

		{
			System.out.println("Instance Block!!");
		}

	}

	public class demo1 {

		static {
			System.out.println("Static block 1");
		}

		{
			System.out.println("Instance Block 1");
		}

	}

}
