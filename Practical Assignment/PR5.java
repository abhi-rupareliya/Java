/*   ID   : 21ce117
     Name : Abhi Rupareliya
     Aim  : According to question no 1, the Account class was defined to model a bank account. 
            An account has the properties account number, balance, annual interest rate, and date 
            created, and methods to deposit and withdraw funds. Create two subclasses for 
            checking and saving accounts. A checking account has an overdraft limit, but a 
            savings account cannot be overdrawn.
*/

public class PR5 {
    public static void main(String[] args) {
        SavingAccount sac = new SavingAccount();
        sac.setBalance(1000);
        sac.withdraw(2000);

        CheckingAccount cac = new CheckingAccount();
        cac.setBalance(1000);
        cac.withdraw(1100);
        System.out.println("Balance = "+cac.getBalance());
    }
}