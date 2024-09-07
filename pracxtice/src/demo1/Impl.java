package demo1;

public class Impl implements Math{

	public static void main(String[] args) {
		

	}

	@Override
	public void sum(int n) {
		int sum=0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
			System.out.println(sum);
		}
		
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
