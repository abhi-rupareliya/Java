/*
 * Name: Abhi Rupareliya
 * Id  : 21ce117
 * Aim : Write a program to transfer data from one file to another file so that if the destination
 *       file does not exist, it is created.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PR5_3 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("C:\\AAA Shortcut\\Java programs\\Assignment 5\\5_2_in.txt");
        FileOutputStream out = new FileOutputStream("C:\\AAA Shortcut\\Java programs\\Assignment 5\\5_2_out.txt");
        try {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            in.close();
            out.close();
        }
    }
}