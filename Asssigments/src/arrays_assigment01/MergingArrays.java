package arrays_assigment01;

public class MergingArrays {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9 };

		System.out.println("Array 1 : ");
		for (int num : arr1) {
			System.out.print(num + " ");

		}
		System.out.println("\nArray 2 : ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}

		// Merge the arrays using mergingArrays
		int[] mergeArray = mergingArrays(arr1, arr2);

		System.out.println("\nMerged Array : ");
		for (int num : mergeArray) {
			System.out.print(num + " ");
		}

	}

	public  static int[] mergingArrays(int[] arr1, int[] arr2) {
		int length1 = arr1.length;
		int length2 = arr2.length;
		int[] result = new int[length1 + length2]; //creating an result-array with length of arr1+arr2

		for (int i = 0; i < length1; i++) {  //copying elements from arr1 to result-array
			result[i] = arr1[i];
		}

		for (int i = 0; i < length2; i++) { // copying elements from arr2 to result-array
			result[length1+i] = arr2[i];    // storing elements of arr2 along with arr1

		}

		return result;

	}

}
