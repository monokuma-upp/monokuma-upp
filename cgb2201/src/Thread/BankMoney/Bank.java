package Thread.BankMoney;

import java.util.Objects;

public class Bank {
    private static int money;

    public Bank(int money){
        this.money = money;
    }

    public void Counter(int money){
        this.money -= money;
        System.out.println("柜台取现：" + "取走了" + money + " 还剩" + this.money + "元");
    }

    public void ATM(int money){
        this.money -= 50;
        System.out.println("ATM机取现：" + "取走了" + money + " 还剩" + this.money + "元");
    }

    public synchronized void outMoney(int money, String mode) throws Exception{
        if(money > Bank.money){
            throw new Exception("取款金额:" + money + "余额只剩：" + Bank.money + " 取款失败");
        }
        if(Objects.equals(mode, "ATM")){
            ATM(money);
        }
        else{
            Counter(money);
        }
    }

    public int getMoney(){
        return money;
    }
}
