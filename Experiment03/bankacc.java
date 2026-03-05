// Problem 1:
// Create a class BankAccount with deposit() and withdraw().
// Create subclass SavingsAccount that prevents withdrawal if balance < 100.

class BankAccount {
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }
}

class SavingsAccount extends BankAccount {
    void withdraw(double amt) {
        if(balance - amt < 100) {
            System.out.println("Cannot withdraw. Minimum balance required is 100.");
        } else {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.deposit(500);
        s.withdraw(450); // should not allow
        s.withdraw(300); // allowed
    }
}