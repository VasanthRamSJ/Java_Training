package Day1;


import java.util.*;
import java.lang.constant.*;
public class Ex15b {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the number");
			int n=input.nextInt(),f=0;
					if(armstrongNumber(n)) {
						System.out.println("The number is an armstrong number");f++;
					}
					if(perfectNumber(n)) {
						System.out.println("The number is a perfect number");f++;
					}
					if(palindrome(n)) {
						System.out.println("The number is a palindrome");f++;
					}
					if(f==0) {
						System.out.println("The number is none of them");
					}
;			input.close();
		}
		static boolean armstrongNumber(int n) {
			int temp, digits=0, last=0, sum=0;   
			
			temp=n;   
			
			while(temp>0)    
			{   
			temp = temp/10;   
			digits++;   
			}   
			temp = n;   
			while(temp>0)   
			{   
		   
			last = temp % 10;   
		
			sum +=  (Math.pow(last, digits));   
			temp = temp/10;   
			}  
		
			if(n==sum)   
		
			return true;      
		
			else return false;   
			
		}
		static boolean perfectNumber(int n) {
			int i=1,sum=0;  
			
			while(i <= n/2)  
			{  
			if(n % i == 0)  
			{  
		
			sum = sum + i;  
			} 
			i++;  
			}  
			if(sum==n)  
			{  
			
			return true; 
			} 
			else  
		    {
				return false ; 
			}  
		}
		static boolean palindrome(int n) {
			String str= Integer.toString(n);
			String str1= "";
			for(int i=str.length()-1;i>=0;i--) {
				str1=str1+str.charAt(i);
			}
			if(str1.equals(str)) {
				return true;
			}
			else {
				return false;
			}
			
		}
}
