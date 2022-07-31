/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
        Given two non-negative int values, return true if they have the same last digit, such
         as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
         10 is 7.
         lastDigit(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true
*/
import java.util.Scanner;

public class PR1_3_Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        num2 = sc.nextInt();

        PR1_3 object = new PR1_3(num1, num2);

        if (object.lastDigit()) System.out.println("Both number has same last digit.");
        else System.out.println("The last digit of both number is different.");
        sc.close();
    }
}
