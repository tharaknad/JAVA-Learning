package practice;

public class Loan {

	public static void main(String[] args) {
		Loan n = new Loan();
		System.out.println(n.ROI(1000));

	}

	double ROI(double d) {
		double intrest = 18.5;
		return d * intrest;
	}
	
}
