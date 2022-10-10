/*   ID   : 21ce117
     Name : Abhi Rupareliya
     Aim  : Use the Account class created in Programming Exercise 1 to simulate an ATM 
            machine.
            Create 10 accounts in an array with id 0, 1, . . . , 9, and an initial balance of $100. 
            • The system prompts the user to enter an id. If the id is entered incorrectly, ask 
            the user to enter a correct id. 
            • Once an id is accepted, the main menu is displayed.
            • You can enter choice 1 for viewing the current balance, 2 for withdrawing 
            money, 3 for depositing money, and 4 for exiting the main menu. 
            • Once the system starts, it will stop by entering number 99. 
 */

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account[] objects = new Account[10];

        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Account(i, 100);
        }
        Simulate(objects);
    }

    public static void Simulate(Account[] array) {
        boolean flag = true;
        int eid;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Id : ");
        eid = sc.nextInt();

        while (flag) {
            if (eid < 10 && eid >= 0) {
                System.out.println("****Menu****");
                System.out.println(" 1.View Balance");
                System.out.println(" 2.Withdraw money");
                System.out.println(" 3.Deposit money");
                System.out.println(" 4.Main Menu");
                System.out.println("99.Exit");
                System.out.print("Make a choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance  = " + array[eid].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter Amount to withdraw : ");
                        int amt = sc.nextInt();
                        array[eid].withdraw(amt);
                        System.out.println("Remaining Balance  = " + array[eid].getBalance());
                        break;
                    case 3:
                        System.out.print("Enter Amount to deposit : ");
                        amt = sc.nextInt();
                        array[eid].deposit(amt);
                        System.out.println("Balance  = " + array[eid].getBalance());
                        break;
                    case 4:
                        Simulate(array);
                        break;
                    case 99:
                        flag = false;
                        break;
                    default:
                        System.out.println("Make a valid choice");
                }
            }
            else{
                System.out.println("Invalid ID");
                flag = false;
            }
        }
        sc.close();
    }
}