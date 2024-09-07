   package twodimensionalarray;

public class String2D_array {

	public static void main(String[] args) {

		String[][] names = { { "one", "two", "three" }, { "four", "five", "six" }, { "seven", "eight", "nine" } };

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {

				System.out.print(names[i][j]+ " ");
			}
			System.out.println();

		}

	}

}
