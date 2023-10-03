package int101.homework01.work04;

public class BankAccount {
    private final int number;
    private final Person owner;
    private static double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance = amount + balance;
    }

    public static double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
        return balance;
    }

    public static void transfer(double amount, BankAccount account) {
        if (amount <= account.balance) {
            withdraw(amount);
            account.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", owner=" + owner +
                '}';
    }
}
