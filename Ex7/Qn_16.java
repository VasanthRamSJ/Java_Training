import java.io.*;
import java.util.*;

public class Qn_16{
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("/Users/vasanthram/Documents/Ex7/Date.txt"))){
            Date date = new Date();
            outputStream.writeObject(date);
            System.out.println("Written to file");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
 * types of input stream..
 * output stream..
 * buffered inputstream and its advantages..
 * 
 * 
 */