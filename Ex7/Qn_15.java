import java.io.*;

public class Qn_15 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/vasanthram/Documents/Ex7/source.txt"));
            PrintWriter writer = new PrintWriter( new FileWriter("/Users/vasanthram/Documents/Ex7/destination.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
