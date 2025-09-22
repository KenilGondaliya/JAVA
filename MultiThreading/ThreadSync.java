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

    void withdraw(int withdrawalAmount, String name) {
        balance = balance - withdrawalAmount;
        System.out.println(name + " Balance after withdrawal: " + balance);
    }
}

class Customer implements Runnable {
    Account x1;
    String name;

    Customer(Account j1, String name1) {
        x1 = j1;
        name = name1;
    }

    public void run() {
        Scanner s1 = new Scanner(System.in);
        synchronized (x1) {

            System.out.println("Enter withdrawal amount for " + name + ":");
            int amt = s1.nextInt();

            if (x1.isSufficientBalance(amt)) {
                x1.withdraw(amt, name);
                System.out.println("Transaction Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        Customer c1 = new Customer(acc, "Kenil");
        Customer c2 = new Customer(acc, "Jay");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
