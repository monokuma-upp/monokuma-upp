package Thread.Synchronize;

import oop.day03.Circle.A;

public class Account {
    String name;
    float account;

    public Account(String name, float account) {
        this.account = account;
        this.name = name;
    }


    public void deposit(float amt) { //存钱
        account += amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdraw(float amt) { //取钱
        account -= amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getAccount() {
        return account;
    }


    static class AccountOperator implements Runnable {
        private Account account;

        public AccountOperator(Account account) {
            super();
            this.account = account;
        }

        @Override
        public void run() {
            synchronized (account) {
                account.deposit(1000);
                account.withdraw(500);
                System.out.println(Thread.currentThread().getName() + ":" + account.getAccount());
            }
        }
    }


    public static void main(String[] args) {
        Account ac = new Account("jim", 5000);
        AccountOperator ao = new AccountOperator(ac);
        AccountOperator ao2 = new AccountOperator(ac);


        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads[i] = new Thread(ao, "Thread" + i);
            threads[i].start();
        }
    }
}

