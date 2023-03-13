package day5;


import java.util.Scanner;
public class Ex6 {
	int count=0;
	public static void main(String[] args) {
		Ex6 obj = new Ex6();
		obj.alphabetCheck();

}
	void alphabetCheck() {
		char character;
		
		Scanner  input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a character (Enter '. to stop the process'): ");
			character = input.next().charAt(0);
			if(character=='.') {
				System.out.println("THE END!");
				input.close();
				break;
				
			}
			
				try {
					if(!Character.isLetter(character)) {
						throw new InvalidAlphabetException();
					}
					else {
						count++;
					}
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
			
				
		
		}
}

class InvalidAlphabetException extends Exception{
	
	
	@Override
	public String toString() {
		return "InvalidAlphabetException [msg= Enter a valid Alphabet]";
	}
	
	}
	
	
}
