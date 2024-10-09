package Thread.BankMoney;

public class PersonB extends Thread{
    private Bank bank;
    private String mode;

    public PersonB(Bank bank, String mode){
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run(){
        while(bank.getMoney() >= 200){
            try{
                bank.outMoney(200, mode);
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
