package day4;

public class Ex6 {
	public static void main(String args[]) {
		DerivedClass derived = new DerivedClass();
		
	}
}
class BaseClass{
	BaseClass(){
		
	int a=1/0;
	System.out.println(a);
	}
	
}
class DerivedClass extends BaseClass {
	public DerivedClass() {
		try {
			BaseClass base = new BaseClass();
		}
		catch(Exception e) {
			System.out.println(e+"exceptions");
		}
		
	}
}