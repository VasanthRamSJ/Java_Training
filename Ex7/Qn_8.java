package Ex7;

import java.util.*;

public class Qn_8{
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            int cnt=0;
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                cnt=cnt+line.length();
                System.out.println(cnt);
            }
          
        }
    }
}