package practice;

public class CarLoan extends Loan {

	public static void main(String[] args) {
		Loan n = new Loan();
		System.out.println(n.ROI(5000));

	}
@Override
	double ROI(double d) {
		double intrest = 10.5;
		return d * intrest;
	}


}
