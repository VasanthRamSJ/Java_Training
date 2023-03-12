

import java.io.*;

public class Qn_14 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/Users/vasanthram/Documents/Ex7/source.txt");
                FileWriter writer = new FileWriter("/Users/vasanthram/Documents/Ex7/destination.txt")) {
            int a;
            while ((a = reader.read()) != -1) {
                writer.write(a);
            }
            System.out.println("file copied");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
