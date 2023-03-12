

import java.io.*;

public class Qn_12 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("/Users/vasanthram/Documents/Ex7/JackDawson.jpg");
                OutputStream outputStream = new FileOutputStream("/Users/vasanthram/Documents/Ex7/RoseDawson.jpg")) {
            byte[] buffer = new byte[1024];
            int readByte = inputStream.read(buffer);
            while ((readByte = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, readByte);
            }
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
