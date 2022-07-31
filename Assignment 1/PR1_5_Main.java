import java.util.Scanner;

public class PR1_5_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String a = sc.next();
        System.out.println("Enter string 2: ");
        String b = sc.next();
        // print number of same substring of length 2.
        PR1_5 object = new PR1_5(a, b);
        System.out.println("stringMatch("+a+","+b+") = "+object.stringMatch());
    }
}
