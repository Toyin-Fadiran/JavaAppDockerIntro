import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        int[] cashBacks = {120, 200, 320, 500, 50, 80, 90, 1000};

        while (true) {
            int luckyNumber = 0;

            System.out.println("Enter your Lucky Number: ");

            try {
                luckyNumber = scanner.nextInt();

                // Check if the lucky number is within the valid range
                if (luckyNumber >= 0 && luckyNumber < cashBacks.length) {
                    System.out.println("For your lucky number " + luckyNumber + " CashBack earned is: " + cashBacks[luckyNumber]);

                    System.out.println("Enter 0 to quit: ");
                    choice = scanner.nextInt();

                    if (choice == 0) {
                        break;
                    }
                } else {
                    System.out.println("Invalid lucky number. Please enter a number between 0 and " + (cashBacks.length - 1));
                }
            } catch (Exception e) {
                System.out.println("Sorry! Input mismatched");
            }
        }

        // Move the scanner close statement outside the loop and the finally block
        scanner.close();
        System.out.println("Thank you for Playing Lucky Number Cashback");
    }
}
