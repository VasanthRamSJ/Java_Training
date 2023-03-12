
import java.io.File;

public class Qn_10b {
    public static void main(String[] args) {
        File file = new File("/Users/vasanthram/Documents/Ex7/file1.txt");
        File renamingFile = new File("/Users/vasanthram/Documents/Ex7/renamingFile.txt");
        if (renamingFile.renameTo(file)) {
            System.out.println("File has been renamed successfully..");
        } else {
            System.out.println("renaming operation failed..");
        }
    }
}
