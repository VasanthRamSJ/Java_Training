package day2;
import java.util.*;
public class Ex5 {
	
	static int count;
public Ex5() {
	count++;
	
}
public static void main(String args[]) {
	Scanner input = new Scanner (System.in);
	System.out.println("enter the number of times the object should be created : ");
	int n =input.nextInt();
for(int i=0;i<n;i++) {
	Ex5 obj = new Ex5();
}

System.out.println(count);
input.close();
}
}
