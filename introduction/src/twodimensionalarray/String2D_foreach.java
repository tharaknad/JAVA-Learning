package twodimensionalarray;

public class String2D_foreach {

	public static void main(String[] args) {
		String[][] names = { { "one", "two", "three" }, { "four", "five", "six" }, { "seven", "eight", "nine" } };

		for (String[] n1 : names) {
			for (String n2 : n1) {
				System.out.print((n2) + " ");
			}
			System.out.println();

		}

	}

}
