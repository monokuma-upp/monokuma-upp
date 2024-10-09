package Thread.BankMoney;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);

        PersonA a = new PersonA(bank, "Counter");
        PersonB b = new PersonB(bank,"ATM");

        a.start();
        b.start();
    }
}
