/*
Name : Rupareliya Abhi K.
ID : 21ce117
Aim :
       Given an array of strings, return a new array without the strings that are equal to the target string.
       One approach is to count the occurrences of the target string, make a new array of the correct length,
       and then copy over the correct strings.
       wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
       wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
       wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/
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
