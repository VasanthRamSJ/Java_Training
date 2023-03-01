package StrategyPattern;
import java.util.Scanner;

public class StrategyPattern {
	public static void main(String args[]) {
		Fan fans= new Fan();
		fans.state = new Off();
		Scanner scanner =new Scanner(System.in);
       
		
		System.out.println("Select mode : ");
		System.out.println("2-Turned On");
		System.out.println("3-Low speed ");
		System.out.println("4-High Speed");
		System.out.println("Enter the mode number : ");
        int n= scanner.nextInt();
		
		System.out.println("The fan is initially in Off state");
		for(int i=0;i<n;i++) {
			
			fans.turnOn();
			}
        scanner.close();
		}

	
	}