package Thread.BankMoney;

public class PersonA extends Thread{
    private Bank bank;
    private String mode;

    public PersonA(Bank bank, String mode){
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run(){
        while(bank.getMoney() >= 100){
            try{
                bank.outMoney(100, mode);
            }
            catch(Exception e){
                e.printStackTrace();
            }

            try{
               sleep(1000);
            }
            catch(Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
