import java.io.*;
import java.util.Scanner;

public class PR7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line to search: ");
        String SearchLine = sc.nextLine();
        sc.close();
        int count = 1;
        try {
            String path = "C:\\AAA Shortcut\\Java programs\\Practical Assignment\\List.txt";
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line;
            // reading file line by line
            while ((line = br.readLine()) != null) {
                if (SearchLine.equals(line.toString()))
                    System.out.println("Line number = " + count);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}