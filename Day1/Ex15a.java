package Day1;

public class Ex15a {
	 public static void main (String[] args)
	   {		
	       int i =0;
	       int temp =100;
	       System.out.println("Prime numbers from 1 to 100 are :");
	       for( i=1;i<=100;i++) {
	    	   if(prime(i)) {
	    		   System.out.print(i+" ");
	    	   }
	       }
	       
	   }
	       
public static boolean prime(int n) {
	     boolean returnType = true;
	       for(int i=2;i<=Math.sqrt(n);++i) {
	    	   if(n%i==0) {
	    		  returnType= false;
	    		  break;
	    	   }
	    	   
	      
	   }
	       return returnType;
}
}