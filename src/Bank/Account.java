package src.Bank;

import java.util.Scanner;

public class Account {
    private double Balance = 0;
    private double Value;

    public void Balance() {
        if (Balance == 0) {
            System.out.println(Utilities.ANSI.BOLD + "Balance: " + Balance + Utilities.ANSI.RESET);
        } else if (Balance > 0) {
            System.out.println(Utilities.ANSI.BOLD_GREEN + "Balance: " + Balance + Utilities.ANSI.RESET);
        } else if (Balance < 0) {
            System.out.println(Utilities.ANSI.BOLD_RED + "Balance: " + Balance + Utilities.ANSI.RESET);
        } else {
            System.out.println(Utilities.ANSI.BOLD_RED + "FATAL ERROR: THE BALANCE COULD NOT BE LOADED!!!" + Utilities.ANSI.RESET);
        }
    }

    public void AddMoney(Scanner sc) {
        System.out.print(Utilities.ANSI.BOLD + "Add: " + Utilities.ANSI.RESET);

        if (sc.hasNextDouble()) {
            Value = sc.nextDouble();
            this.Balance += Value;
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next();
        }
    }

    public void ToTransferMoney(Scanner sc) {
        System.out.print(Utilities.ANSI.BOLD + "To transfer: ");

        if (sc.hasNextDouble()) {
            Value = sc.nextDouble();
            this.Balance -= Value;
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next();
        }
    }
}