package interfacedemo;

public class ProblemImpl implements Math {

	int a;
	int b;
	int c;

	public ProblemImpl(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void addition() {
		c = a + b;
		System.out.println("addition : " + c);

	}

	@Override
	public void substraction() {
		c = a - b;
		System.out.println("Substraction : " + c);

	}

	@Override
	public void division() {
		c = a / b;
		System.out.println("Divison : " + c);

	}

	@Override
	public void multiply() {
		c = a * b;
		System.out.println("Multiply : " + c);

	}

}
