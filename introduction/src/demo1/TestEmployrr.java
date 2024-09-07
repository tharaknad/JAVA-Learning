package demo1;

public class TestEmployrr {

	public static void main(String[] args) {

		Employee n = new Employee();// inherit

		n.setId(2);
		n.setName("rajesh");
		n.setSalary(35000);
		
		System.out.println(n.getId());
		System.out.println(n.getName());
		System.out.println(n.getSalary());

		

	}

}
