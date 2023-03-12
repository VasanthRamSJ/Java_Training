
import java.io.*;

public class Qn_10c {
    public static void main(String[] args) {
        try{
        File file = new File("/Users/vasanthram/Documents/Ex7/fileSize.txt");
        System.out.println(file.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}