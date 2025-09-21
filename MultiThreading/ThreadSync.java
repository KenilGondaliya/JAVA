import java.util.Scanner;

class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }

    boolean isSufficientBalance(int withdrawalAmount) {
        if (balance >= withdrawalAmount) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int withdrawalAmount) {
        balance = balance - withdrawalAmount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

class Customer implements Runnable {
    Account x1;

    Customer(Account j1) {
        x1 = j1;
    }

    public void run() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        int amt = s1.nextInt();
        s1.close();

        if (x1.isSufficientBalance(amt)) {
            x1.withdraw(amt);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
