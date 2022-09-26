/*
   Name: Abhi Rupareliya
   ID  : 21ce117
   Pr  : Write a program to increment the value of one variable by one and display it after one
         second using thread using sleep() method.
*/

public class PR6_3 {
    public static void main(String[] args) {
        int var;
        for (var = 1; var <= 10; var++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.print(var + " ");
        }
    }
}
