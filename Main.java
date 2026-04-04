import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account Mateus = new Account();

        while (true) {
            System.out.println(Utilities.ANSI.BOLD + "=== LiveBank ===" + Utilities.ANSI.RESET);
            System.out.println(Utilities.ANSI.BOLD_GREEN + "1. Add money" + Utilities.ANSI.RESET);
            System.out.println(Utilities.ANSI.BOLD_YELLOW + "2. To transfer money" + Utilities.ANSI.RESET);
            System.out.println(Utilities.ANSI.BOLD_RED + "3. Exit" + Utilities.ANSI.RESET);
            Mateus.Balance();

            if (scanner.hasNextByte()) {
                byte c = scanner.nextByte();

                if (c == 1) {
                    Mateus.AddMoney(scanner);
                } else if (c == 2) {
                    Mateus.ToTransferMoney(scanner);
                } else if (c == 3) {
                    break;
                } else {
                    System.out.println(Utilities.ANSI.BOLD_RED + "ERROR: Unknown choice!" + Utilities.ANSI.RESET);
                }
            } else {
                System.out.println(Utilities.ANSI.BOLD_RED + "ERROR: Invalid entry! Please enter a number!" + Utilities.ANSI.RESET);
                scanner.next();
            }
        }
        scanner.close();
    }
}