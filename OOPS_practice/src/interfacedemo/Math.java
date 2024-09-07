package interfacedemo;

public interface Math {

	 abstract void addition();

	public abstract void substraction();

	public abstract void multiply();

	public abstract void division();
	
	public static void Shapes() {
		System.out.println("Static Method");
	}
	
	public default void method1() {
		System.out.println("Default method");
	}

}
