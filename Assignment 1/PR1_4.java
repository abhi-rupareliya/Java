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

public class PR1_4 {
    int num;
    int[] array;
    Scanner sc = new Scanner(System.in);

    public PR1_4(int n) {
        num = n;
        array = new int[n];
    }

    public void input() {
        //input of the array
        System.out.println("Enter "+num+" elements : ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
    }

    //checking for the sequence of 1 2 3
    public boolean Check() {
        for (int i = 0; i < num - 2; i++) {
            if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}
