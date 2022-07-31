import java.util.Scanner;

public class PR1_6_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayStrings = new String[4];
        String[] result;
        String target;

        System.out.println("Enter strings : ");
        for (int i = 0; i < arrayStrings.length; i++) {
            arrayStrings[i] = sc.next();
        }
        System.out.println("Enter target string :");
        target = sc.next();

        PR1_6 object = new PR1_6(arrayStrings,target);

        System.out.println("The string array after removing the target string is :");
        // storing string array after removing target string.
        result = object.wordWithout();
        for (String s : result) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}
