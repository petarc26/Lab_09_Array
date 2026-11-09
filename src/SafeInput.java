import java.util.Scanner;
public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Enter an integer.");
            }
            pipe.nextLine();
        } while (!valid);
        return value;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Enter a number.");
            }

            pipe.nextLine();
        } while (!valid);

        return value;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Number is out of range.");
                }
            } else {
                System.out.println("Invalid input. Enter an integer.");
            }
            pipe.nextLine();
        } while (!valid);

        return value;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();

                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Number is out of range.");
                }
            } else {
                System.out.println("Invalid input. Enter a number.");
            }
            pipe.nextLine();
        } while (!valid);
        return value;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                return true;
            } else if (response.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Enter Y or N.");
            }
        } while (true);
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        } while (!valid);
        return response;
    }
    public static void prettyHeader(String msg) {
        int width = 60;
        int spaces = 54 - msg.length();
        int leftSpaces = spaces / 2;
        int rightSpaces = spaces - leftSpaces;
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("***");
        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("***");
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
