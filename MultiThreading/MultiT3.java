import java.util.Scanner;

class Account {

    int bal;
    String name;

    Account(int balance, String name1) {
        bal = balance;
        name = name1;
    }

    public boolean isSufficientBalance(int wb) {
        if (bal > wb) {

            return true;
        } else {
            return false;
        }
    }

    public void withdraw(int wb) {
        bal = bal - wb;
        System.out.println("Withdrawn amount: " + wb);
        System.out.println("Current Balance: " + bal);
        System.out.println("Withrawal Successful");
    }
}

class Customer implements Runnable {

    Account h1;
    String name;

    Customer(Account g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {
        synchronized (h1) {
            Scanner s1 = new Scanner(System.in);
            System.out.println(name + " Enter the amount to withdraw: ");
            int amt = s1.nextInt();

            if (h1.isSufficientBalance(amt)) {

                System.out.println(name+"Collect your money");
                h1.withdraw(amt);
            } else {
                System.out.println(name+"Insufficient Balance");
            }
        }
    }
}

public class MultiT3 {
    public static void main(String[] args) {
        Account a1 = new Account(1000, "Kenil");
        Customer c1 = new Customer(a1, "Kenil");
        Customer c2 = new Customer(a1, "Karan");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
