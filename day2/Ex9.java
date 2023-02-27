package day2;

public class Ex9 {
public static void main(String args[]) {
	A a = new A();
	System.out.println("public variable class A : "+a.b);
	//a.a//not visible
	System.out.println("protected variable class A : "+a.c);

	a.m1();a.m3();
	//a.m2()//not visible
	B b = new B();
	System.out.println("public variable class B : "+b.b);
	System.out.println("protected variable class B : "+b.c);
	b.m1();b.m3();
	//b.m2() // not visible


}
}
class A extends B{
	private int a=10;
	public int b=9;
	protected int c=1;
	public void m1() {System.out.println("public method A");}
	private void m2() {System.out.println("private method A");}
	protected void m3() {System.out.println("protected method A");}
	
	
}
class B{
	private int a=9;
	public int b=8;
	protected int c=0;
	public void m1() {System.out.println("public method B");}
	private void m2() {System.out.println("private method B");}
	protected void m3() {System.out.println("protected method B");}

	

}