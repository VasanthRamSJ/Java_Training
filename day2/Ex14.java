package day2;

public class Ex14 {
	public static void main(String args[]) {
		
		Student s= new Student();
		Result r = new Result();
		s.details(100,"vasanth");
		int result = r.totalMarks();
		System.out.println("the total marks of students is : "+result);
	}

}
 class Student{
	 public int rollNo;
	 public String name;
	 Student(){
		 this.rollNo=0;
		 this.name=null;
	 }
	 void details(int r, String n) {
		rollNo=r;
		name =n;
		System.out.println("Roll no : "+rollNo +" name : "+name);
	 }
 }
 class Exam extends Student{
	int sub1;
	int sub2;int sub3;
	void marks(int s1,int s2,int s3) {
		sub1=s1;
		sub2=s2;
		sub3=s3;
		System.out.println("marks of all three subjects are : "+sub1+" "+sub2+" "+sub3);
	}
	 
 }
 class Result extends Exam{
	 int s1, s2,s3;
	 Exam ex=new Exam();
	 int totalMarks() {
		 ex.marks(12, 12, 12);
		 s1=ex.sub1;
		 s2=ex.sub2;
		 s3=ex.sub3;
		 return s1+s2+s3;
	 }
 }