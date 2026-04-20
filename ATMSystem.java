import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        try {
            // User input
            System.out.print("Enter PIN: ");
            String pin = sc.next();

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            // Validation
            if (pin.length() != 4) {
                throw new Exception("Invalid PIN! Must be 4 digits.");
            }

            if (amount % 100 != 0) {
                throw new Exception("Amount must be multiple of 100.");
            }

            // Inner try (balance check)
            try {
                if (amount > balance) {
                    throw new Exception("Insufficient Balance!");
                }

                // Nested try (cash dispenser error)
                try {
                    Random r = new Random();
                    int chance = r.nextInt(2); // 0 or 1

                    if (chance == 0) {
                        throw new Exception("Cash Dispenser Error!");
                    }

                    balance -= amount;
                    System.out.println("Withdraw Successful!");
                    System.out.println("Remaining Balance: ₹" + balance);

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }
        sc.close();
    }
}
