package Day1;
import java.util.*;
public class Ex18 {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number");
	int n=input.nextInt(),i; input.close();
	Hashtable<Character, String> a = new Hashtable<>();
	 String number=Integer.toString(n);
	a.put('0', "zero");
	a.put('1', "one");
    a.put('2', "two");
    a.put('3', "three");
    a.put('4', "four");
    a.put('5', "five");
    a.put('6', "six");
    a.put('7', "seven");
    a.put('8', "eight");
    a.put('9', "nine");
  String word="";
  for(i=0;i<number.length();i++) {
	  word = word+a.get(number.charAt(i))+" ";
  }
 System.out.println("the number in words is "+word);

}
}
