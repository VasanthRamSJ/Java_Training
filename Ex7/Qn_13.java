
import java.io.*;
public class Qn_13 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try(BufferedReader reader =new BufferedReader(new FileReader("/Users/vasanthram/Documents/Ex7/file1.txt"))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
