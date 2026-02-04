import java.util.Scanner;

// -------- MAIN ACCOUNT (Base Class) --------
class BankManagement {
    String name;
    int accountNumber;
    double balance;

    void createAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// -------- SAVING ACCOUNT --------
class SavingAccount extends BankManagement {

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void addInterest() {
        double interest = balance * 0.04; // 4% interest
        balance += interest;
        System.out.println("Interest Added: ₹" + interest);
    }
}

// -------- LOAN ACCOUNT --------
class LoanAccount extends BankManagement {
    double loanAmount;

    void takeLoan(double amount) {
        loanAmount = amount;
        System.out.println("Loan Taken: ₹" + loanAmount);
    }

    void payEMI(double emi) {
        if (emi <= loanAmount) {
            loanAmount -= emi;
            System.out.println("EMI Paid: ₹" + emi);
        } else {
            System.out.println("EMI amount exceeds loan balance!");
        }
    }

    void showLoanDetails() {
        System.out.println("Remaining Loan: ₹" + loanAmount);
    }
}

// -------- MAIN CLASS --------
public class BankManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.createAccount("Utkrisht Patel", 101, 5000);

        System.out.println("\n--- Saving Account ---");
        sa.displayAccount();
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.addInterest();
        sa.displayAccount();

        // Loan Account
        LoanAccount la = new LoanAccount();
        la.createAccount("Utkrisht Patel", 201, 0);

        System.out.println("\n--- Loan Account ---");
        la.takeLoan(100000);
        la.payEMI(10000);
        la.showLoanDetails();

        sc.close();
    }
}

