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
	
	System.out.println("Enter subject 6 marks : ");
	String subject_6=input.nextLine();
	int sub6 = Integer.parseInt(subject_6);
	
	System.out.println("Enter subject 7 marks : ");
	String subject_7=input.nextLine();
	int sub7 = Integer.parseInt(subject_7);
	
	System.out.println("Enter subject 8 marks : ");
	String subject_8=input.nextLine();
	int sub8 = Integer.parseInt(subject_8);
	
	System.out.println("Enter subject 9 marks : ");
	String subject_9=input.nextLine();
	int sub9 = Integer.parseInt(subject_9);
	
	System.out.println("Enter subject 10 marks : ");
	String subject_10=input.nextLine();
	int sub10 = Integer.parseInt(subject_10);
	
	

	
	avg=(sub1+sub2+sub3+sub4+sub5+sub6+sub7+sub8+sub9+sub10)/10;
System.out.println("Average : "+avg);
		

	}
	catch(NumberFormatException e) {
		System.out.println(e);
	}
	
	}
}
}
