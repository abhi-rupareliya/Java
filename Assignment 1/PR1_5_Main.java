/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
       Given 2 strings, a and b, return the number of the positions where they contain the
       same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
       and "az" substrings appear in the same place in both strings.
       stringMatch("xxcaazz", "xxbaaz") → 3
       stringMatch("abc", "abc") → 2
       stringMatch("abc", "axc") → 0
*/
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
