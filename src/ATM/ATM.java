package ATM;

import java.util.Scanner;

public class ATM
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialBalance = 00.00;
        USERBANK account = new USERBANK(initialBalance);

        while (true) {
            //the interface where user will choose options
            System.out.println("\n\tWELCOME TO OUR ATM");
            System.out.println("\nChoose an option:\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

             //switch to perform actions based on users choice
            switch (choice) {
                case 1:
                    double depositAmount;
                    System.out.print("Enter Amount you wish to deposit: ");
                    depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    double withdrawAmount;
                    System.out.print("Enter amount you wish to withdraw: ");
                    withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: R" + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.please visit again" + "Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
