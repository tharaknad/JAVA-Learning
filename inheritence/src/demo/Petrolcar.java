package demo;

public class Petrolcar extends Electriccar
{

	public static void main(String[] args) {
		
		Petrolcar p=new Petrolcar();
		
		p.signallights();
		p.fueltank();
		

	}
	
	void fueltank() {
		System.out.println(" petrol tank");
	}

}
