package day2;

public class Ex7 {
	public static void main(String args[]){
		
		final FinalReferenceTest obj = new FinalReferenceTest("Jai", 6);
		obj.show();
		obj.name = "Sandy";
		obj.show();
	}
}
class FinalReferenceTest{
	String name;
	int rollNo;
 
	FinalReferenceTest(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
 
	void show(){
	    System.out.println("Object State: ");
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
	}
}