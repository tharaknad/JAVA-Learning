package polymorphism;

public class Demo1 implements Interf {
	public static void main(String[] args) {

	}
	@Override

	public void divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % n == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
	@Override
	public void divisor_sum1(int a) {
		
		
		
	}
	@Override
	public void divisor_sum2(int b) {
		// TODO Auto-generated method stub
		
	}

}
