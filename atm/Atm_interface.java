package atm;

import java.util.Scanner;

public class Atm_interface
{
    private BankAccount bankAccount;

    public Atm_interface(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void displayMenu(){
        System.out.println("ATM Menu:-");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawl");
        System.out.println("4 Exit");
    }
    public void performTranscation(int choice, Scanner scanner){
        if(choice == 1){
            System.out.println("Current balance :$ "+bankAccount.getBalance());
        }
        else if(choice == 2){
            System.out.println("Enter deposit amount: $ ");
            double depositAmount = scanner.nextDouble();
            bankAccount.deposit(depositAmount);
        }
        else if(choice == 3){
            System.out.println("Enter withdrawl amount: $");
            double withdrawlAmount = scanner.nextDouble();
            bankAccount.withdrawl(withdrawlAmount);
        }
        else if(choice == 4){
            System.out.println("Exiting ATM, Thank you!");
            scanner.close();
            System.exit(0);
        }
        else{
            System.out.println("Invalid choice. Please select a valid option ");
        }
    }
}