package encapsulation;

public class TestExample1 {

	public static void main(String[] args) {

		Example1 e = new Example1();

		float area1 = e.getHeigth() * e.getBreath();

		System.out.println(area1);
		System.out.println("------------");

		e.setHeigth(90);
		e.setBreath(34);
		float area2 = e.getBreath() * e.getHeigth();

		System.out.println(area2);

		

	}

}
