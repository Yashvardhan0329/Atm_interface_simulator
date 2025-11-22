package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial account balance: $");
        double initialBalance= sc.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance);

        Atm_interface atm= new Atm_interface (bankAccount);

        while (true){
            atm.displayMenu();
            System.out.println("Select an option:");
            int choice = sc.nextInt();
            atm.performTranscation(choice, sc);
        }

        
    }
    
}