import java.util.Scanner;

// Base class
class Account {
    int accountNo;
    String name;
    String address;
    String dob;

    void addAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter DOB: ");
        dob = sc.nextLine();
    }

    void displayAccount() {
        System.out.println("\nAccount No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("DOB: " + dob);
    }
}

// Saving Account
class SavingAccount extends Account {
    double balance = 0;

    void deposit(Scanner sc) {
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();
        balance += amount;
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Saving Balance: " + balance);
    }
}

// Loan Account
class LoanAccount extends Account {
    double loanAmount;

    void addLoan(Scanner sc) {
        System.out.print("Enter Loan Amount: ");
        loanAmount = sc.nextDouble();
    }

    void payEMI(Scanner sc) {
        System.out.print("Enter EMI Amount: ");
        double emi = sc.nextDouble();
        loanAmount -= emi;
    }

    void displayLoan() {
        System.out.println("Remaining Loan Amount: " + loanAmount);
    }
}

// Main class
public class BankManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Saving Account");
        System.out.println("2. Loan Account");
        System.out.print("Choose Account Type: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            SavingAccount sa = new SavingAccount();
            sa.addAccount(sc);

            sa.deposit(sc);
            sa.withdraw(sc);

            sa.displayAccount();
            sa.displayBalance();

        } else if (choice == 2) {
            LoanAccount la = new LoanAccount();
            la.addAccount(sc);
            la.addLoan(sc);

            la.payEMI(sc);

            la.displayAccount();
            la.displayLoan();
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
/*           ┌────────────────────┐
            │      Account       │
            ├────────────────────┤
            │ - accountNo : int  │
            │ - name : String    │
            │ - address : String │
            │ - dob : String     │
            ├────────────────────┤
            │ + addAccount()     │
            │ + displayAccount()│
            └─────────▲──────────┘
                      │
        ┌─────────────┴─────────────┐
        │                           │
┌────────────────────┐   ┌────────────────────┐
│  SavingAccount     │   │   LoanAccount      │
├────────────────────┤   ├────────────────────┤
│ - balance : double │   │ - loanAmount:double│
├────────────────────┤   ├────────────────────┤
│ + deposit()        │   │ + addLoan()         │
│ + withdraw()       │   │ + payEMI()          │
│ + displayBalance() │   │ + displayLoan()     │
└────────────────────┘   └────────────────────┘
*/