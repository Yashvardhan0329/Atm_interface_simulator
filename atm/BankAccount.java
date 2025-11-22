package atm;

public class BankAccount{
    private double balance;
    
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance() {
        return balance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of $   "+amount+"successful.current balance:  $" +balance);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawl(double amount){
        if (amount>0 && amount<= balance){
            balance-=amount;
            System.out.println("Withdrawl of $"+amount+"successful. Current balance :$"+balance);
        }
        else{
            System.out.println("Insufficiet balance");
        }
    }
}
class ATM{
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void displayMenu(){
        System.out.println("ATM Menu:-");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawl");
        System.out.println("4 Exit");
    }
}    