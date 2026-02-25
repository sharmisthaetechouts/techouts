package CJ5.Threads;


class Bank {
    private int balance = 1000;
    private final Object lock = new Object(); //Constructs a new object.

    // Deposit method - notifies waiting threads
    public void deposit(int amount) {
        synchronized (lock) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance = " + balance);
            lock.notify(); // wakes up waiting withdraw thread
        }
    }

    // Withdraw method - waits if balance is insufficient
    public void withdraw(int amount) throws InterruptedException {
        synchronized (lock) {
            while (balance < amount) {
                System.out.println(Thread.currentThread().getName() + " waiting to withdraw " + amount + ", balance = " + balance);
                lock.wait(); // releases lock and waits
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance = " + balance);
        }
    }
}

class WithdrawThread extends Thread {
    private Bank bank;
    private int amount;

    public WithdrawThread(Bank bank, int amount, String name) {
        super(name);
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) { // check interrupt flag
                bank.withdraw(amount);
                Thread.sleep(1000); // pause after withdraw
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted and stopped");
        }
    }
}

class DepositThread extends Thread {
    private Bank bank;
    private int amount;

    public DepositThread(Bank bank, int amount, String name) {
        super(name);
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                bank.deposit(amount);
                Thread.sleep(1500); // pause after deposit
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted and stopped");
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();

        WithdrawThread t1 = new WithdrawThread(bank, 1200, "WithdrawThread-1");
        DepositThread t2 = new DepositThread(bank, 500, "DepositThread-1");

        t1.start();
        t2.start();

        Thread.sleep(5000); // main thread sleeps for 5 seconds

        // Interrupt the withdraw thread
        t1.interrupt(); // sets interrupt flag
        t1.join(); // wait for thread to finish
        t2.join(); // wait for deposit thread to finish

        System.out.println("Final balance check completed.");
    }
}