package day4;
import java.io.*;

//Example of FileNotFoundException
public class Ex1 {

public static void main(String[] args) {
 // Creating an instance of FileReader class
	
 FileReader fileReader = new FileReader("Test.txt");

 System.out.println(fileReader.read());

 fileReader.close();
	
}
}