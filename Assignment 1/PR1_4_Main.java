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
