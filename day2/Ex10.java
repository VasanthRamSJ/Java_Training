package day2;

public class Ex10 {
	public static void main(String args[]) {
		
	//	A1 a = new A1();
	C c = new C();
	
	}
}
class A1 {
	
	public A1() {
		System.out.println("class A1 da!!");
	}
}
class B1{
	public B1() {
		System.out.println("class B1 da!!");
	}
}
class C extends A1 {
	B1 b = new B1();
	 
	
	
}