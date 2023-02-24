package day4;

import java.util.*;

public class Ex7b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numerator = "0", denominator = "0";
		int flag = 0;

		while (flag == 0) {

			System.out.println("Enter the numerator:");
			numerator = sc.next();
			if (isNumeric(numerator)) {
				flag++;
				continue;

			} else {
				System.out.println("enter valid input");
			}
		}

		flag = 0;

		while (flag == 0) {
			System.out.println("Enter the denominator:");
			denominator = sc.next();
			if (isNumeric_(denominator)) {
				flag++;
				continue;
			} else {
				System.out.println("enter valid input");
			}

		}
		findQuotient(numerator, denominator);
		sc.close();
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		} else if (strNum.equals("q") || strNum.equals("Q")) {

			System.exit(0);
		} else {
			try {
				int integer = Integer.parseInt(strNum);
			} catch (NumberFormatException nfe) {
				return false;
			}

		}
		return true;
	}

	public static boolean isNumeric_(String strNum) {
		if (strNum == null) {
			return false;
		}

		try {
			int integer = Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void findQuotient(String numerator, String denominator) {
		try {
			int numerator_ = Integer.parseInt(numerator);
			int denominator_ = Integer.parseInt(denominator);
			if (denominator_ == 0) {
				throw new ArithmeticException();
			}

			else {
				System.out.println("Quotient  - " + ((float) numerator_ / denominator_));
			}
		} catch (ArithmeticException exception) {
			System.out.println("Poor input data!");
			System.out.println(exception);
		}
	}
}
