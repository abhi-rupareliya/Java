/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
       Implement Caesar Cipher.
*/
import java.util.Scanner;

public class PR1_10_Main {
    public static void main(String[] args) {
        int shift;
        String message;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the massage to implement Caesar Cipher :");
        message = sc.next();
        System.out.println("Enter shift value :");
        shift = sc.nextInt();

        PR1_10 object = new PR1_10(message,shift);
        // implementing caesar cipher....
        System.out.println("Value after implementation : "+object.implement());
    }
}
