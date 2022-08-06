/*
Name : Rupareliya Abhi K.
ID   : 21ce117.
Aim  : (Subclasses  of  Account)  In  Programming  Exercise  2,  the  Account  class  was
       defined to model a bank account. An account has the properties account number,
       balance,  annual  interestrate,  and  date  created,  and  methods  to  deposit
       and withdrawfunds.  Create  two  subclasses  for  checking  and  saving  accounts.
       A checkingaccount  has  an  overdraft  limit,  but  a  savings  account  cannot  be overdrawn.Draw
       the  UML  diagram  for  the  classes  and  then implement  them. Writea  test  program  that  creates
       objects  of  Account,  SavingsAccount,  and CheckingAccount and invokes their toString() methods.
*/

public class AccountMain {
    public static void main(String[] args) {
        CheckingAccount CAobject = new CheckingAccount(101,10000);
        SavingAccount SAobject = new SavingAccount(102,7000);
        System.out.println("\nBefore Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(CAobject);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(SAobject);

        CAobject.withdraw(16000);
        SAobject.withdraw(7500); // cannot withdraw more amount than balance in saving account.
        System.out.println("\nAfter Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(CAobject);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(SAobject);
    }

}
