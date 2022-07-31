import java.util.Scanner;

public class PR1_8 {
    char[] key = new char[10];
    char[][] studentAns = new char[8][10];
    int[] result = new int[8];
    Scanner sc = new Scanner(System.in);

    // takes inout of key and the answers of the students.
    public void input() {
        System.out.print("Enter key of answer : ");
        for (int i = 0; i < key.length; i++) {
            key[i] = sc.next().charAt(0);
        }

        System.out.println("Enter the answers of the student : ");
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter answer of student " + (i + 1) + " : ");
            for (int j = 0; j < 10; j++) {
                studentAns[i][j] = sc.next().charAt(0);
            }
        }

    }

    // checks the answer of students with key.
    public void check() {
        int mark;
        for (int i = 0; i < 8; i++) {
            mark = 0;
            for (int j = 0; j < 10; j++) {
                if (studentAns[i][j] == key[j]) mark++;
            }
            result[i] = mark;
        }
    }

    //print the result of students.
    public void printResult() {
        System.out.println("Result.....");
        for (int i = 0; i < 8; i++) {
            System.out.println("student " + (i + 1) + " :" + result[i]);
        }
    }
}
