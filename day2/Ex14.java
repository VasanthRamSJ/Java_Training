package day2;

public class Ex14 {
	public static void main(String args[]) {
		
		Student student= new Student();
		Result result = new Result();
		student.details(100,"vasanth");
		int totalResult = result.totalMarks();
		System.out.println("the total marks of students is : "+totalResult);
	}

}
 class Student{
	 public int rollNo;
	 public String name;
	 Student(){
		 this.rollNo=0;
		 this.name=null;
	 }
	 void details(int rollNo, String name) {
		 this.rollNo=rollNo;
		this.name =name;
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
	 Exam exam=new Exam();
	 int totalMarks() {
		 exam.marks(12, 12, 12);
		 s1=exam.sub1;
		 s2=exam.sub2;
		 s3=exam.sub3;
		 return s1+s2+s3;
	 }
 }