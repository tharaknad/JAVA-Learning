package twodimensionalarray;

public class Integer2D_Foreach {

	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] n1 : numbers) {
			for (int n2 : n1) {
				System.out.print((n2) + " ");
			}
			System.out.println();
		}

	}

}
