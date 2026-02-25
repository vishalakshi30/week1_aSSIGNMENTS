package Module3;

public class BankAccount {

        private int accountNumber;
        private double balance;

        BankAccount(int acc, double bal) {
            accountNumber = acc;
            balance = bal;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance)
                balance -= amount;
            else
                System.out.println("Insufficient Balance");
        }

        public void display() {
            System.out.println("Account: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        public static void main(String[] args) {
            BankAccount b = new BankAccount(101, 5000);
            b.deposit(2000);
            b.withdraw(1000);
            b.display();
        }
    }

