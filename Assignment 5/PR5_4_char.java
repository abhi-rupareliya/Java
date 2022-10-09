/*
 * Name: Abhi Rupareliya
 * Id  : 21ce117
 * Aim : WAP to show use of character and byte stream.
 */
import java.io.FileReader;

public class PR5_4_char {
    public static void main(String[] args) {
        FileReader reader = null; // read() reads character by character
        try {
            reader = new FileReader("C:\\AAA Shortcut\\Java programs\\Assignment 5\\5_1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) {
                System.out.println((char) fChar);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}