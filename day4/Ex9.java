package day4;

import java.util.*;

public class Ex9 {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);
		int avg = 0, i = 0, a = 0;
		int sum = 0;
		while (avg == 0) {
			try {

				while (i < 10) {
					System.out.println("Enter subject " + (i + 1) + " marks : ");
					String subject = input.nextLine();
					int sub = Integer.parseInt(subject);

					if (sub > 100) {

						throw new OutOfRangeException();

					}
					if (sub < 0) {

						throw new NegativeRangeException();

					}
					sum = sum + sub;
					i++;

				}
				System.out.println("Average : " + (sum / 10));
				avg++;
			}

			catch (NegativeRangeException | OutOfRangeException | InputMismatchException | NumberFormatException e) {

				e.printStackTrace();

			}

		}

	}
}

class OutOfRangeException extends Exception {
	OutOfRangeException() {
		System.out.println("enter the number with in the range");
	}
}

class NegativeRangeException extends Exception {
	NegativeRangeException() {
		System.out.println("It is a negative number..it is invalid");
	}
}

/*
 * public class Ex9 { public static void main(String[] args) { Scanner input=
 * new Scanner(System.in); int i=1; while(i==1) {
 * System.out.println("enter the number : "); int n=input.nextInt(); try { else
 * { i++; System.out.println("Valid input"); } } catch(OutOfRangeException e) {
 * System.out.println(e); } } (
 * 
 * 
 * }
 * 
 * }
 * 
 * class OutOfRangeException extends Exception{ OutOfRangeException(){
 * System.out.println("enter the number with in the range"); }
 * 
 * 
 * 
 * }
 */