package src.Bank;

public class Utilities {
    public class ANSI {
        public static final String RESET = "\u001B[0m";
        public static final String BOLD  = "\u001B[1m";

        public static final String BOLD_RED = "\u001B[1m\u001B[31m";
        public static final String BOLD_GREEN = "\u001B[1m\u001B[32m";
        public static final String BOLD_YELLOW = "\u001B[1m\u001B[33m";
    }

    public static void ClearScreen() {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println(ANSI.BOLD_RED + "ERROR: FAILED TO CLEAN THE SCREEN!" + ANSI.RESET);
        }
    }
}
