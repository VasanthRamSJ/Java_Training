

import java.io.*;

public class Qn_11 {
    public static void main(String[] args) {
        File directoryName = new File("/Users/vasanthram/Documents/Ex7");

        String fileNames[] = directoryName.list();
        for (String temp : fileNames) {
            System.out.println(temp);
        }

    }
}
