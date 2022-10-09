/*
 * Name: Abhi Rupareliya
 * Id  : 21ce117
 * Aim : Write a program to enter any 15 numbers from the user and store only even numbers in a file
 *       named “Even.txt”. And display the contents of this file on the console.(BufferedReader / BufferedWriter).
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PR5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileReader in = null;
        FileWriter out = null;
        String filelocation = "Even.txt";
        File file = new File(filelocation);
        try {
            out = new FileWriter("Even.txt");
            bw = new BufferedWriter(out);
            ArrayList<Integer> num = new ArrayList<Integer>(15);
            System.out.println("Enter 15 Numbers : ");
            for (int i = 0; i < 15; i++) {
                Scanner sc = new Scanner(System.in);
                num.add(sc.nextInt());
            }
            for (int i = 0; i < 15; i++) {
                if (((num.get(i)) % 2 == 0)) {
                    bw.write(num.get(i));
                }
            }
            bw.close();
            int tmp;
            in = new FileReader("Even.txt");
            br = new BufferedReader(in);
            System.out.println("");
            System.out.println("Printing even numbers from file.");
            while ((tmp = br.read()) != -1) {
                System.out.println((tmp));
            }
        } catch (Exception e) {
            System.out.println(" Some exception are founf ! Please entered valid integer!!! ");
        } finally {
            br.close();
        }
    }
}