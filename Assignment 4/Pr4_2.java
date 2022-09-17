/*
    Name : Abhi Rupareliya.
    ID   : 21CE117.
    Pr   : WAP to generate user defined exception using “throw” and “throws” keyword.
*/

package P4;
import java.util.Scanner;

class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

}

public class Pr4_2 {
    public static void main(String[] args) throws MyException {
            try {
                ReadValue();
            } catch (MyException e) {
                System.out.println(e);
            }
        }
    

    static void ReadValue() throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        sc.close();
        if (a < 10)
            throw new MyException("Value is less than 10.");
    }
}
