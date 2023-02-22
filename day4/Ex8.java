package day4;
import java.util.*;
public class Ex8 {
public static void main(String args[]) throws Exception{
	Scanner input = new Scanner(System.in);
	int avg=0;
	while(avg==0) {
	try {
		
			System.out.println("Enter subject 1 marks : ");
	String subject_1=input.nextLine();
	int sub1 = Integer.parseInt(subject_1);
	
	System.out.println("Enter subject 2 marks : ");
	String subject_2=input.nextLine();
	int sub2 = Integer.parseInt(subject_2);
	
	System.out.println("Enter subject 3 marks : ");
	String subject_3=input.nextLine();
	int sub3 = Integer.parseInt(subject_3);

	System.out.println("Enter subject 4 marks : ");
	String subject_4=input.nextLine();
	int sub4 = Integer.parseInt(subject_4);

	System.out.println("Enter subject 5 marks : ");
	String subject_5=input.nextLine();
	int sub5 = Integer.parseInt(subject_5);

	
	avg=(sub1+sub2+sub3+sub4+sub5)/5;
System.out.println("Average : "+avg);
		

	}
	catch(NumberFormatException e) {
		System.out.println(e);
	}
	
	}
}
}
