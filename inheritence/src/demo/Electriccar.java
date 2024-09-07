package demo;

public class Electriccar extends Car {

	public static void main(String[] args) {
		
		Electriccar c=new Electriccar();
		
		
		
		c.design();
		c.brakes();
		c.doors();
		c.signallights();
		c.steering();
		c.battery();
		c.speed();
		
		

	}
	
	void battery() {
		System.out.println("battery full");
	}
	void speed() {
		System.out.println(" moderate speed is 20KMPH");
	}

}
