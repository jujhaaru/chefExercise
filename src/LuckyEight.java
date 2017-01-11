import java.util.Scanner;

public class LuckyEight {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int digit = inp.nextInt();

		String[] numberAsString = inp.next().split("");
		int[] number = new int[numberAsString.length];
		for (int i = 0; i < numberAsString.length; i++) {
			number[i] = Integer.parseInt(numberAsString[i]);
		}
		if (number.length == digit) {
			/*for (int i = 0; i < number.length; i++) {
				
			}*/
printCombination(number, number.length, 3);
		}
		inp.close();
	}

	static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
		// Current combination is ready to be printed, print it
		if (index == r) {
			for (int j = 0; j < r; j++)
				System.out.print(data[j] + " ");
			System.out.println("");
			return;
		}

		// replace index with all possible elements. The condition
		// "end-i+1 >= r-index" makes sure that including one element
		// at index will make a combination with remaining elements
		// at remaining positions
		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r);
		}
	}

	// The main function that prints all combinations of size r
	// in arr[] of size n. This function mainly uses combinationUtil()
	static void printCombination(int arr[], int n, int r) {
		// A temporary array to store all combination one by one
		int data[] = new int[r];

		// Print all combination using temprary array 'data[]'
		combinationUtil(arr, data, 0, n - 1, 0, r);
	}
}
