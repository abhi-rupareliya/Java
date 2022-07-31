/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
       Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
       array123([1, 1, 2, 3, 1]) → true
       array123([1, 1, 2, 4, 1]) → false
       array123([1, 1, 2, 1, 2, 3]) → true
*/
import java.util.Scanner;

public class PR1_4_Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements : ");
        n = sc.nextInt();

        // object of PR1_4
        PR1_4 object = new PR1_4(n);
        //input of array elements
        object.input();
        //checking for the sequence.
        if(object.Check()){
            System.out.println("The array contains sequence of 1 2 3.");
        }
        else {
            System.out.println("The array doesn't contain sequence.");
        }
    }
}
