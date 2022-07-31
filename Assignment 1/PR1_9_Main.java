/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
        The problem is to check whether a given Sudoku solution is correct.
*/
import java.util.Scanner;
public class PR1_9_Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given Sudoku Solution :");
        int arr1[][] = new int[9][9];
        int arr2[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr1[i][j] = sc.nextInt();
                arr2[j][i] = arr1[i][j];
            }
        }

        PR1_9 object =new PR1_9();
        object.Sudoku(arr1,arr2);

    }
}