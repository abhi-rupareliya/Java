import java.util.Scanner;

public class PR1_7_Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of triangle : ");
        num = sc.nextInt();
        PR1_7 object = new PR1_7(num);
        object.printPyramid();//function to print pyramid of n rows.
    }
}
