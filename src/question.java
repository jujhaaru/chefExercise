import java.util.Scanner;

public class question {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		// flip a binary digit
		int number = inp.nextInt();
		int[] array = new int[100];
		for (int i = 0; i < number; i++) {
			array[inp.nextInt()]++;
		}
		inp.close();
		for (int i = 0; i < array.length; i++) {

			if (array[i] == 1)
				System.out.println(i);
		}
System.out.println(11^12);
	}
}
