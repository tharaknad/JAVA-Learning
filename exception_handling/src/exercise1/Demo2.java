package exercise1;

public class Demo2 {

	public static void main(String[] args) {

		
		System.out.println("Before ");
		try {
			int[] arr = new int[3];

			arr[0] = 10;
			arr[1] = 11;
			arr[2] = 22;
			arr[3]=33;

			for (int a : arr) {
				System.out.println(a);
			}
		} catch (Exception e) {
			System.out .println(e.toString());
			
		}

		System.out.println("After ");

	}

}
