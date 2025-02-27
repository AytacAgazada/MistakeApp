package incorrect_app_third;

import java.util.Scanner;

public class Main {
    static String[] accountHolders = {"Alice", "Bob", "Charlie"};
    static double[] balances = {1000.0, 1500.0, 2000.0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    transfer(scanner);
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    static void deposit(Scanner scanner) {
        System.out.print("Enter account index (1-3): ");
        int index = scanner.nextInt();

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balances[index - 1] += amount;
            System.out.println("Deposit successful! New Balance: " + balances[index - 1]);
        }
    }

    static void withdraw(Scanner scanner) {
        System.out.print("Enter account index (1-3): ");
        int index = scanner.nextInt();

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= balances[index - 1]) {
            balances[index - 1] -= amount;
            System.out.println("Withdrawal successful! New Balance: " + balances[index - 1]);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void transfer(Scanner scanner) {
        System.out.print("Enter sender account index (1-3): ");
        int sender = scanner.nextInt();
        System.out.print("Enter receiver account index (1-3): ");
        int receiver = scanner.nextInt();

        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();

        if (amount <= balances[sender - 1]) {
            balances[sender - 1] -= amount;
            balances[receiver - 1] += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    static void checkBalance(Scanner scanner) {
        System.out.print("Enter account index (1-3): ");
        int index = scanner.nextInt();

        if (index >= 1 && index <= accountHolders.length) {
            System.out.println("Account Holder: " + accountHolders[index - 1]);
            System.out.println("Balance: " + balances[index - 1]);
        } else {
            System.out.println("Invalid account index!");
        }
    }
}
