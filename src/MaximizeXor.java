import java.util.Scanner;

 class MaximizeXor {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int number = inp.nextInt();
		int number1 = inp.nextInt();
		int flag = 0;
		inp.close();
		for (int i = number; i <= number1; i++) {
			for (int j = i + 1; j <= number1; j++) {
				int result = (i ^ j);
				if (result > flag)
					flag = result;

			}

		}
		System.out.println(flag);
	}

}
