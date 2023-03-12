
import java.io.*;
import java.util.*;
public class Qn_9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter the sentence : ");
        String inputSentence = input.nextLine();
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
        finally{
            input.close();
        }
        System.out.println(cnt);
    }
}