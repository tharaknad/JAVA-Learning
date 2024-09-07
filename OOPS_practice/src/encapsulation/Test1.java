package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getDept());
		
		
		System.out.println("------------");
		System.out.println("------------");
		
		
		s.setId(12);
		s.setName("Loki");
		s.setDept("ECE");
		
		System.out.println(s.getId());;
		System.out.println(s.getName());
		System.out.println(s.getDept());
		

	}

}
