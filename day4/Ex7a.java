package day4;

import java.util.*;

public class Ex7a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, denominator = 0;

		System.out.println("Enter the numerator:");
		numerator = input.nextInt();
		while (denominator == 0) {
			System.out.println("Enter a valid denominator:");
			denominator = input.nextInt();
			testDivisionOperation(numerator, denominator);
		}
	}

	public static void testDivisionOperation(int numerator, int denominator) {
		try {
			if (denominator == 0)
				throw new ArithmeticException();
			else
				System.out.println("Quotient  - " + ((float) numerator / denominator));
		} catch (ArithmeticException exception) {
			System.out.println("Poor input data!");
			System.out.println(exception);
		}
	}
}