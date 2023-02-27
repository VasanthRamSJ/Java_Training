package day4;

import java.util.*;

public class Ex8 {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);
		int avg = 0;
		while (avg == 0) {
			try {
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					System.out.println("Enter subject " + (i + 1) + " marks : ");
					String subject = input.nextLine();
					int sub = Integer.parseInt(subject);
					sum = sum + sub;
					if (i == 9) {
						avg++;
					}
				}

				System.out.println("Average : " + (sum / 10));

			} catch (NumberFormatException e) {
				System.out.println(e);
			}

		}
	}
}
