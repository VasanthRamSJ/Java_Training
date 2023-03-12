

import java.io.*;

public class Qn_10a {
    public static void main(String[] args) {
        File file = new File("/Users/vasanthram/Documents/Ex7/vasanth.txt");
        try {
          
                if (file.delete()) {
                    System.out.println("The file " + file.getName() + " is deleted");
                    return;
                }

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
