package multilevel;

public class Eagle extends Birds {

	public static void main(String[] args) {
		
		Birds b=new Eagle();
		
		b.fly();
		

	}
	void predator(){
		System.out.println(" Eagle will hunt");
		
	}

}
