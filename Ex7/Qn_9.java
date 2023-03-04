
package Ex7;

import java.io.*;

public class Qn_9 {
    public static void main(String[] args) {

        String inputSentence = "My name is Vasanth";
        int cnt = 0;
        try (BufferedReader reader = new BufferedReader(new StringReader(inputSentence))) {
            String sentence;
            while ((sentence = reader.readLine()) != null) {
                String[] words = sentence.split(" ");
                cnt = cnt + words.length;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(cnt);
    }
}