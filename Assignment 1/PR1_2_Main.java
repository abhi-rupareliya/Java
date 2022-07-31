import java.util.Scanner;

public class PR1_2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string : ");
        str = sc.next();
        PR1_2 object = new PR1_2();
        object.startOz(str);
        sc.close();
    }
}

