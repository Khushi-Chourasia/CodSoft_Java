import java.util.*;

class BankAccount {
    private double balance;  //declaring balance variable as private - maintaining integrity and security

    public BankAccount(double initial_bal) {
        balance = initial_bal;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs." + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful.");
        }
    }
}

public class ATM_Interface {
    private BankAccount account;  //account variable holds references to objects of the BankAccount class.

    public ATM_Interface(BankAccount acc) {
        account = acc;
    }

    public void displayMenu() {
        System.out.println("\nWelcome to the ATM Interface");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performTransaction() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("\nEnter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("\nEnter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("\nThank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } while (choice != 4);
        // loop continues unless the user chooses to exit by entering the choice as 4 
        sc.close();
    }

    public void checkBalance() {
        System.out.println("\nYour current balance is: Rs." + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initial balance set to Rs.1000
        ATM_Interface atm = new ATM_Interface(account);  //object creation
        atm.performTransaction();
    }
}